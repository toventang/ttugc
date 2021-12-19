package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdkapi.model.AbstractC11837c;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.n */
public final class C5822n implements AbstractC22025a {
    static {
        Covode.recordClassIndex(6428);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a
    /* renamed from: a */
    public final AbstractC22029d mo11597a(final Request request) {
        return new AbstractC22029d() {
            /* class com.bytedance.android.live.network.C5822n.C58231 */

            /* renamed from: c */
            private AbstractC11837c<C11835a> f14680c;

            static {
                Covode.recordClassIndex(6429);
            }

            @Override // com.bytedance.retrofit2.client.AbstractC22029d
            /* renamed from: a */
            public final boolean mo11599a(long j) {
                return false;
            }

            @Override // com.bytedance.retrofit2.client.AbstractC22029d
            /* renamed from: b */
            public final void mo11600b() {
                AbstractC11837c<C11835a> cVar = this.f14680c;
                if (cVar != null) {
                    try {
                        cVar.mo18909b();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.bytedance.retrofit2.client.AbstractC22029d
            /* renamed from: a */
            public final C22028c mo11598a() {
                TypedInput typedByteArray;
                MethodCollector.m26663i(11491);
                String method = request.getMethod();
                if ("GET".equals(method) || "POST".equals(method)) {
                    ArrayList arrayList = new ArrayList();
                    List<C22027b> headers = request.getHeaders();
                    if (headers != null) {
                        for (C22027b bVar : headers) {
                            if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable() || !TextUtils.equals(bVar.f52037a, "response-format")) {
                                arrayList.add(new C2959a(bVar.f52037a, bVar.f52038b));
                            }
                        }
                    }
                    if (TextUtils.equals("GET", method)) {
                        this.f14680c = C5809h.m12739a().mo11584a(request.getUrl(), arrayList, request.getExtraInfo());
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (request.getBody() != null) {
                            request.getBody().writeTo(byteArrayOutputStream);
                        }
                        if (request.getBody() instanceof MultipartTypedOutput) {
                            this.f14680c = C5809h.m12739a().mo11583a(request.getMaxLength(), request.getUrl(), arrayList, request.getBody().mimeType(), byteArrayOutputStream.toByteArray(), request.getBody().length(), request.getBody().md5Stub());
                        } else {
                            this.f14680c = C5809h.m12739a().mo11586a(request.getUrl(), arrayList, request.getBody().mimeType(), byteArrayOutputStream.toByteArray(), request.getExtraInfo());
                        }
                    }
                    final C11835a a = this.f14680c.mo18908a();
                    ArrayList arrayList2 = new ArrayList();
                    if (a.f28194c != null) {
                        for (C2959a aVar : a.f28194c) {
                            arrayList2.add(new C22027b(aVar.getName(), aVar.getValue()));
                        }
                    }
                    if (request.isResponseStreaming()) {
                        typedByteArray = new TypedInput() {
                            /* class com.bytedance.android.live.network.C5822n.C58231.C58241 */

                            static {
                                Covode.recordClassIndex(6430);
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            public final long length() {
                                return (long) a.f28196e.length;
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            public final String mimeType() {
                                return a.f28195d;
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            /* renamed from: in */
                            public final InputStream mo11577in() {
                                MethodCollector.m26663i(11487);
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.f28196e);
                                MethodCollector.m26664o(11487);
                                return byteArrayInputStream;
                            }
                        };
                    } else {
                        typedByteArray = new TypedByteArray(a.f28195d, a.f28196e, new String[0]);
                    }
                    C22028c cVar = new C22028c(a.f28192a, a.f28193b, a.f28197f, arrayList2, typedByteArray);
                    MethodCollector.m26664o(11491);
                    return cVar;
                }
                C3854a.m9453a(6, "RetrofitProvider", "REQUEST NOT GET OR POST");
                MethodCollector.m26664o(11491);
                return null;
            }
        };
    }
}
