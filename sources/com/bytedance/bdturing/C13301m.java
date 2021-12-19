package com.bytedance.bdturing;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bdturing.p863c.C13261c;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.m */
public class C13301m {

    /* renamed from: a */
    public HandlerThread f32546a;

    /* renamed from: b */
    HandlerC13303b f32547b;

    static {
        Covode.recordClassIndex(15263);
    }

    private C13301m() {
    }

    /* renamed from: com.bytedance.bdturing.m$a */
    public static class C13302a {

        /* renamed from: a */
        public static C13301m f32548a = new C13301m((byte) 0);

        static {
            Covode.recordClassIndex(15264);
        }
    }

    /* synthetic */ C13301m(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo21472a(Runnable runnable) {
        HandlerC13303b bVar = this.f32547b;
        if (bVar != null) {
            bVar.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.bdturing.m$b */
    public class HandlerC13303b extends Handler {
        static {
            Covode.recordClassIndex(15265);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    C13261c cVar = (C13261c) message.obj;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("os_name", "android");
                        C13292k.f32507a.lockInterruptibly();
                        jSONObject.put("touch", new JSONArray((Collection) C13292k.f32508b));
                        C13285g.m23905d("responseGetTouchToJs motion list size " + C13292k.f32508b.size());
                        C13292k.f32508b.clear();
                        C13285g.m23905d("responseGetTouchToJs end motion list size " + C13292k.f32508b.size());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        C13292k.f32507a.unlock();
                        throw th;
                    }
                    C13292k.f32507a.unlock();
                    try {
                        cVar.mo21430a(1, jSONObject);
                    } catch (Exception unused2) {
                    }
                } else if (i == 3) {
                    try {
                        C13292k.f32507a.lockInterruptibly();
                        C13292k.f32508b.clear();
                    } catch (Exception unused3) {
                    } catch (Throwable th2) {
                        C13292k.f32507a.unlock();
                        throw th2;
                    }
                    C13292k.f32507a.unlock();
                }
            } else if (message.obj != null) {
                ((DialogC13293l) message.obj).mo21457a();
            }
        }

        private HandlerC13303b(Looper looper) {
            super(looper);
        }

        /* synthetic */ HandlerC13303b(C13301m mVar, Looper looper, byte b) {
            this(looper);
        }
    }

    /* renamed from: a */
    public final void mo21471a(int i, Object obj) {
        HandlerC13303b bVar = this.f32547b;
        if (bVar != null) {
            this.f32547b.sendMessage(bVar.obtainMessage(i, obj));
        }
    }
}
