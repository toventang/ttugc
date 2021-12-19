package com.p2082ss.mediakit.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.lang.reflect.Field;

/* renamed from: com.ss.mediakit.net.AVMDLMultiNetwork */
public class AVMDLMultiNetwork {
    private static Network mCellularNetwork;
    private static ConnectivityManager mCm;
    private static long mCurNetId;
    private static Network mCurNetwork;
    protected static Handler mHandler;
    private static HandlerThread mThread;

    static {
        Covode.recordClassIndex(101230);
    }

    public static Network getCellularNetwork() {
        Network network;
        MethodCollector.m26663i(11729);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCellularNetwork;
            } finally {
                MethodCollector.m26664o(11729);
            }
        }
        return network;
    }

    public static Network getCurNetwork() {
        Network network;
        MethodCollector.m26663i(11567);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCurNetwork;
            } finally {
                MethodCollector.m26664o(11567);
            }
        }
        return network;
    }

    public static void switchToCellularNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 1;
            mHandler.sendMessage(message);
            AVMDLLog.m147905d("AVMDLMultiNetwork", "send msg of switch to cellular network");
        }
    }

    public static void switchToDefaultNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 2;
            mHandler.sendMessage(message);
            AVMDLLog.m147905d("AVMDLMultiNetwork", "send msg of switch to default network");
        }
    }

    public static void switchToDefaultNetworkInternal() {
        AVMDLLog.m147905d("AVMDLMultiNetwork", "try switch to default network");
        if (mCurNetId != 0) {
            AVMDLLog.m147905d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            AVMDLDataLoader.getInstance().onCellularAlwaysUp(0);
            mCurNetId = 0;
            setCurNetwork(null);
        }
        AVMDLLog.m147905d("AVMDLMultiNetwork", "end try switch to default network");
    }

    public static void switchToCellularNetworkInternal() {
        int i;
        Network cellularNetwork = getCellularNetwork();
        if (cellularNetwork != null) {
            long netId = getNetId(cellularNetwork);
            AVMDLLog.m147905d("AVMDLMultiNetwork", "try switch to cellular curNetId: " + mCurNetId + " netId:" + netId);
            if (mCurNetId != netId) {
                AVMDLLog.m147905d("AVMDLMultiNetwork", "do switch");
                IPCache.getInstance().clear();
                i = AVMDLDataLoader.getInstance().onCellularAlwaysUp(NetUtils.getNetId(cellularNetwork));
                mCurNetId = netId;
                setCurNetwork(cellularNetwork);
            } else {
                AVMDLLog.m147905d("AVMDLMultiNetwork", "cur is cellular, not need switch");
                i = 0;
            }
            AVMDLLog.m147905d("AVMDLMultiNetwork", "end switch to cellular, ret:".concat(String.valueOf(i)));
        }
    }

    private static long getNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    public static void onCellularNetwork(Network network) {
        MethodCollector.m26663i(11566);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCellularNetwork = network;
            } finally {
                MethodCollector.m26664o(11566);
            }
        }
    }

    public static void setCurNetwork(Network network) {
        MethodCollector.m26663i(11568);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCurNetwork = network;
            } finally {
                MethodCollector.m26664o(11568);
            }
        }
    }

    private static void initHandler(Context context) {
        MethodCollector.m26663i(11402);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                if (mThread == null) {
                    HandlerThread handlerThread = new HandlerThread("AVMDLMultiNetwork");
                    mThread = handlerThread;
                    handlerThread.start();
                    mHandler = new Handler(mThread.getLooper()) {
                        /* class com.p2082ss.mediakit.net.AVMDLMultiNetwork.HandlerC861142 */

                        static {
                            Covode.recordClassIndex(101232);
                        }

                        public final void handleMessage(Message message) {
                            Network network;
                            if (message.obj != null) {
                                network = (Network) message.obj;
                            } else {
                                network = null;
                            }
                            AVMDLLog.m147905d("AVMDLMultiNetwork", C1764a.m5928a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                            int i = message.what;
                            if (i == 0) {
                                AVMDLMultiNetwork.onAvailableInternal(network);
                            } else if (i == 1) {
                                AVMDLMultiNetwork.switchToCellularNetworkInternal();
                            } else if (i == 2) {
                                AVMDLMultiNetwork.switchToDefaultNetworkInternal();
                            }
                            AVMDLLog.m147905d("AVMDLMultiNetwork", C1764a.m5928a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                        }
                    };
                }
                if (context != null && mCm == null) {
                    mCm = (ConnectivityManager) m147911x16762b1f(context, "connectivity");
                }
            } finally {
                MethodCollector.m26664o(11402);
            }
        }
    }

    public static boolean alwayUpCellular(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            AVMDLLog.m147905d("AVMDLMultiNetwork", "build version not support:" + Build.VERSION.SDK_INT);
            return false;
        }
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.m147905d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        try {
            mCm.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() {
                /* class com.p2082ss.mediakit.net.AVMDLMultiNetwork.C861131 */

                static {
                    Covode.recordClassIndex(101231);
                }

                public final void onAvailable(Network network) {
                    Message message = new Message();
                    message.obj = network;
                    message.what = 0;
                    AVMDLMultiNetwork.mHandler.sendMessage(message);
                    AVMDLLog.m147905d("AVMDLMultiNetwork", "send msg of onavailable ");
                }
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void onAvailableInternal(Network network) {
        ConnectivityManager connectivityManager;
        if (network != null && (connectivityManager = mCm) != null) {
            NetworkInfo com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo = m147912x2e2d39f1(connectivityManager, network);
            AVMDLLog.m147905d("AVMDLMultiNetwork", "start on available");
            AVMDLLog.m147905d("AVMDLMultiNetwork", "network name: " + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getTypeName() + "[" + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getSubtypeName() + "], state: " + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getDetailedState() + " netid:" + getNetId(network));
            NetworkCapabilities networkCapabilities = mCm.getNetworkCapabilities(network);
            if (networkCapabilities == null || !networkCapabilities.hasTransport(0) || !networkCapabilities.hasCapability(12)) {
                AVMDLDataLoader.getInstance().onCellularAlwaysUp(0);
            } else {
                onCellularNetwork(network);
                AVMDLDataLoader.getInstance().onInitMultiNetworkEnv();
            }
            AVMDLLog.m147905d("AVMDLMultiNetwork", "end on available");
        }
    }

    /* renamed from: com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo */
    public static NetworkInfo m147912x2e2d39f1(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147911x16762b1f(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11564);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11564);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
