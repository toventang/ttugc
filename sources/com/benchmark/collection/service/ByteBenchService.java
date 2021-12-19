package com.benchmark.collection.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.benchmark.AbstractC2432c;
import com.benchmark.AbstractC2468d;
import com.benchmark.p117a.C2413a;
import com.benchmark.p119c.C2436b;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.tools.C2517e;
import com.benchmark.tools.C2521f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import org.json.JSONObject;

public class ByteBenchService extends Service {

    /* renamed from: a */
    public AbstractC2468d f7381a;

    /* renamed from: b */
    public ByteBenchProcessInterface f7382b;

    /* renamed from: c */
    public volatile EnumC2463a f7383c = EnumC2463a.INVALID;

    /* renamed from: d */
    public String f7384d = "";

    /* renamed from: e */
    public String f7385e = "";

    /* renamed from: f */
    public String f7386f;

    /* renamed from: g */
    private final AbstractC2432c f7387g = new AbstractC2432c.AbstractBinderC2433a() {
        /* class com.benchmark.collection.service.ByteBenchService.BinderC24611 */

        static {
            Covode.recordClassIndex(2816);
        }

        @Override // com.benchmark.AbstractC2432c
        /* renamed from: a */
        public final void mo6798a() {
            EnumC2463a aVar = ByteBenchService.this.f7383c;
            EnumC2463a aVar2 = ByteBenchService.this.f7383c;
            if (aVar == EnumC2463a.START) {
                ByteBenchService.this.f7382b.stopByteBench();
                ByteBenchService.this.f7383c = EnumC2463a.STOP;
                if (ByteBenchService.this.f7381a != null) {
                    ByteBenchService.this.f7381a.mo6843a(102, "stop");
                }
            } else if (ByteBenchService.this.f7381a != null) {
                ByteBenchService.this.f7381a.mo6842a(102, -1, "stop failed");
            }
        }

        @Override // com.benchmark.AbstractC2432c
        /* renamed from: a */
        public final void mo6799a(int i, String str, String str2, AbstractC2468d dVar) {
            ByteBenchService.this.f7381a = dVar;
            if (ByteBenchService.this.f7383c != EnumC2463a.START && ByteBenchService.this.f7383c != EnumC2463a.DESTROY) {
                if (ByteBenchService.this.f7383c == EnumC2463a.INVALID) {
                    ByteBenchService.this.f7382b = new ByteBenchProcessInterface();
                    if (ByteBenchService.this.f7382b.init(str, ByteBenchService.this.f7384d, ByteBenchService.this.f7385e, ByteBenchService.this.f7386f, ByteBenchService.this) < 0) {
                        ByteBenchService.this.f7383c = EnumC2463a.INVALID;
                        return;
                    }
                    ByteBenchService.this.f7382b.setByteBenchCallback(dVar);
                    C2521f.m7395a("ByteBenchService", C2436b.f7319m.f7330k);
                    LogcatInvoker.m7366a(C2436b.f7319m.f7330k);
                    C2413a.m7257a(new C2517e.AbstractC2518a() {
                        /* class com.benchmark.collection.service.ByteBenchService.BinderC24611.C24621 */

                        static {
                            Covode.recordClassIndex(2817);
                        }

                        @Override // com.benchmark.tools.C2517e.AbstractC2518a
                        /* renamed from: a */
                        public final void mo6840a(String str, JSONObject jSONObject) {
                            try {
                                if (ByteBenchService.this.f7381a != null) {
                                    ByteBenchService.this.f7381a.mo6845a(str, jSONObject.toString());
                                }
                            } catch (RemoteException e) {
                                e.getMessage();
                            }
                        }
                    });
                    ApplogUtilsInvoker.Init();
                    ByteBenchService.this.f7383c = EnumC2463a.INIT;
                }
                if (ByteBenchService.this.f7382b != null) {
                    int loadByteBench = ByteBenchService.this.f7382b.loadByteBench(str2);
                    if (loadByteBench != 0) {
                        ByteBenchService.this.f7383c = EnumC2463a.INVALID;
                        if (ByteBenchService.this.f7381a != null) {
                            ByteBenchService.this.f7381a.mo6842a(101, loadByteBench, "init start failed");
                            return;
                        }
                        return;
                    }
                    int startTest = ByteBenchService.this.f7382b.startTest(i, str2);
                    if (startTest < 0) {
                        if (ByteBenchService.this.f7381a != null) {
                            ByteBenchService.this.f7381a.mo6842a(101, startTest, "start failed");
                        }
                        ByteBenchService.this.f7383c = EnumC2463a.INIT;
                        return;
                    }
                    ByteBenchService.this.f7383c = EnumC2463a.START;
                    if (ByteBenchService.this.f7381a != null) {
                        ByteBenchService.this.f7381a.mo6843a(101, "start");
                    }
                } else if (ByteBenchService.this.f7381a != null) {
                    ByteBenchService.this.f7381a.mo6842a(101, -1, "start failed");
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(2815);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public void onCreate() {
        KevaBuilder.getInstance().setContext(m7301a(this));
        Keva.forceInit();
        C2436b.f7319m.f7320a = m7301a(this);
    }

    public void onDestroy() {
        this.f7383c = EnumC2463a.DESTROY;
        ByteBenchProcessInterface byteBenchProcessInterface = this.f7382b;
        if (byteBenchProcessInterface != null) {
            byteBenchProcessInterface.destroy();
            this.f7382b = null;
        }
        C2436b.f7319m.f7320a = null;
        this.f7383c = EnumC2463a.INVALID;
        super.onDestroy();
    }

    /* renamed from: com.benchmark.collection.service.ByteBenchService$a */
    enum EnumC2463a {
        INVALID,
        INIT,
        START,
        STOP,
        DESTROY;

        static {
            Covode.recordClassIndex(2818);
        }
    }

    /* renamed from: a */
    private static Context m7301a(ByteBenchService byteBenchService) {
        Context applicationContext = byteBenchService.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public IBinder onBind(Intent intent) {
        this.f7383c = EnumC2463a.INVALID;
        this.f7384d = getCacheDir().getPath();
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir != null) {
            this.f7385e = externalCacheDir.getPath();
        }
        this.f7386f = getApplicationInfo().nativeLibraryDir;
        C2436b.f7319m.f7330k = intent.getByteExtra("Loglevel", (byte) 3);
        return this.f7387g.asBinder();
    }
}
