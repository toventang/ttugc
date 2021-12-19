package com.lynx.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.HandlerC28362g;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import com.lynx.tasm.utils.C28927k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class NetworkingModule extends LynxModule implements HandlerC28362g.AbstractC28363a {
    private WeakReference<Handler> mHandler = new WeakReference<>(new HandlerC28362g(Looper.getMainLooper(), this));

    static {
        Covode.recordClassIndex(34325);
    }

    @Override // com.lynx.jsbridge.HandlerC28362g.AbstractC28363a
    public final void handleMsg(Message message) {
    }

    public NetworkingModule(Context context) {
        super(context);
    }

    @AbstractC28359d
    public final void request(final ReadableMap readableMap, final Callback callback) {
        if (this.mHandler.get() != null) {
            this.mHandler.get().post(new Runnable() {
                /* class com.lynx.jsbridge.NetworkingModule.RunnableC283531 */

                static {
                    Covode.recordClassIndex(34326);
                }

                public final void run() {
                    try {
                        AbstractC28853k kVar = LynxEnv.m56706b().f66636c;
                        C28847e eVar = new C28847e(readableMap.getString("url"));
                        if (readableMap.hasKey("method")) {
                            eVar.f68087b = readableMap.getString("method");
                        }
                        if (readableMap.hasKey("dataType")) {
                            eVar.f68089d = readableMap.getString("dataType");
                        }
                        if (readableMap.hasKey("responseType")) {
                            eVar.f68090e = readableMap.getString("responseType");
                        }
                        if (readableMap.hasKey("data")) {
                            eVar.f68091f = readableMap.getDynamic("data").mo48556e();
                        }
                        if (readableMap.hasKey("header")) {
                            try {
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject(readableMap.getString("header"));
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject.getString(next));
                                }
                                eVar.f68088c = hashMap;
                            } catch (Throwable unused) {
                            }
                        }
                        kVar.mo33447a(eVar, new AbstractC28846d() {
                            /* class com.lynx.jsbridge.NetworkingModule.RunnableC283531.C283541 */

                            static {
                                Covode.recordClassIndex(34327);
                            }

                            @Override // com.lynx.tasm.provider.AbstractC28846d
                            public final void onFailed(C28848f fVar) {
                                callback.invoke(fVar.f68093b);
                            }

                            @Override // com.lynx.tasm.provider.AbstractC28846d
                            public final void onSuccess(C28848f fVar) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("statusCode", fVar.f68092a);
                                    jSONObject.put("header", fVar.f68094c.toString());
                                    jSONObject.put("data", C28927k.m57941a(fVar.f68095d));
                                    callback.invoke(jSONObject.toString());
                                } catch (Exception e) {
                                    callback.invoke(e.toString());
                                }
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
