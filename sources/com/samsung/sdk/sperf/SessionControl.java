package com.samsung.sdk.sperf;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.samsung.android.perfsdkservice.IPerfSDKService;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

class SessionControl {
    private static SessionControl instance;
    public LocalSocket client;

    /* renamed from: in */
    public DataInputStream f68364in;
    private Object localSocketObject;
    private IPerfSDKService mService;
    public DataOutputStream out;
    private Vector<SPerfListener> perfSDKListerners;
    public LocalServerSocket server;
    public String socketName = ("PERFSDK_SOC_" + Long.toString(Double.doubleToLongBits(Math.random()), 36).substring(0, 5));

    static {
        Covode.recordClassIndex(35081);
    }

    private SessionControl() {
        createServer();
        SPerfUtil.log("Make Server for connection with PerfSDK Server");
        this.localSocketObject = getService();
        this.perfSDKListerners = new Vector<>();
    }

    public static SessionControl createInstance() {
        if (instance == null) {
            instance = new SessionControl();
        }
        SessionControl sessionControl = instance;
        if (sessionControl == null || (sessionControl.getDataInputStream() != null && sessionControl.getDataOutputStream() != null)) {
            return instance;
        }
        instance = null;
        return null;
    }

    private void createServer() {
        new Thread(new Runnable() {
            /* class com.samsung.sdk.sperf.SessionControl.RunnableC289331 */

            static {
                Covode.recordClassIndex(35082);
            }

            public void run() {
                MethodCollector.m26663i(5775);
                try {
                    SessionControl.this.server = new LocalServerSocket(SessionControl.this.socketName);
                    SessionControl sessionControl = SessionControl.this;
                    sessionControl.client = sessionControl.server.accept();
                    SessionControl.this.f68364in = new DataInputStream(SessionControl.this.client.getInputStream());
                    SessionControl.this.out = new DataOutputStream(SessionControl.this.client.getOutputStream());
                    MethodCollector.m26664o(5775);
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        SessionControl.this.server.close();
                        SessionControl.this.server = null;
                        MethodCollector.m26664o(5775);
                    } catch (IOException unused) {
                        SessionControl.this.server = null;
                        MethodCollector.m26664o(5775);
                    }
                }
            }
        }).start();
    }

    public void addListerner(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector != null) {
            vector.add(sPerfListener);
        }
    }

    public Object callback(Object obj) {
        return obj;
    }

    public DataInputStream getDataInputStream() {
        return this.f68364in;
    }

    public DataOutputStream getDataOutputStream() {
        return this.out;
    }

    public Object getService() {
        if (this.localSocketObject == null) {
            try {
                IBinder service = ServiceManager.getService("perfsdkservice");
                if (service != null) {
                    this.mService = IPerfSDKService.Stub.asInterface(service);
                    SPerfUtil.log("Get mService Interface");
                }
                IPerfSDKService iPerfSDKService = this.mService;
                if (iPerfSDKService != null) {
                    try {
                        this.localSocketObject = Integer.valueOf(iPerfSDKService.initPerfSDK(this.socketName));
                        String allowedPkgName = this.mService.getAllowedPkgName();
                        if (allowedPkgName != null && allowedPkgName.length() > 0) {
                            Boost.setNativePkgName(allowedPkgName);
                        }
                        SPerfUtil.log("Do initPerfSDK");
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            } catch (NoSuchMethodError e2) {
                e2.printStackTrace();
            }
        }
        return this.localSocketObject;
    }

    public void notifyReleaseToListener() {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onReleasedByTimeout();
        }
    }

    public void notifyyWarningLevelToListener(int i) {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onHighTempWarning(i);
        }
    }

    public boolean removeListener(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return false;
        }
        return vector.remove(sPerfListener);
    }
}
