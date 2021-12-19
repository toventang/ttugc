package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p215e.p217b.C3886a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.br */
public final class C7150br extends AbstractC18334e<JSONObject, C7155a> implements AbstractC7044a {

    /* renamed from: a */
    public AbstractC88412b f17819a;

    /* renamed from: b */
    public Fragment f17820b;

    /* renamed from: c */
    DialogC9146a f17821c;

    /* renamed from: d */
    C18338g f17822d;

    static {
        Covode.recordClassIndex(7896);
    }

    /* renamed from: a */
    public final void mo13373a() {
        DialogC9146a aVar = this.f17821c;
        if (aVar != null) {
            aVar.dismiss();
            this.f17821c = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17819a;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f17820b = null;
        this.f17822d = null;
    }

    public C7150br(Fragment fragment) {
        this.f17820b = fragment;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.br$a */
    static final class C7155a {
        @AbstractC27891c(mo46611a = "code")

        /* renamed from: a */
        int f17833a;
        @AbstractC27891c(mo46611a = "uri")

        /* renamed from: b */
        String f17834b;
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: c */
        String f17835c;

        static {
            Covode.recordClassIndex(7901);
        }

        private C7155a(String str, String str2) {
            this.f17833a = 1;
            this.f17834b = str;
            this.f17835c = str2;
        }

        /* synthetic */ C7155a(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final C18338g gVar) {
        final JSONObject jSONObject2 = jSONObject;
        this.f17822d = gVar;
        int optInt = jSONObject2.optInt("action_type", 0);
        if (optInt == 0) {
            C6670f.m14183a(C11279p.m20001a(gVar.f43859a)).mo12816a(new AbstractC6656d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br.C71511 */

                static {
                    Covode.recordClassIndex(7897);
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: b */
                public final void mo11014b(String... strArr) {
                    C13628n.m24507a(gVar.f43859a, 2131234335, (int) R.string.gj4);
                    C7150br.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: a */
                public final void mo11013a(String... strArr) {
                    int optInt = jSONObject2.optInt("duration_limit", 10);
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C7150br.this.f17820b.getActivity() == null) {
                        C7150br.this.finishWithFailure();
                    } else {
                        C7150br.this.f17820b.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            C6670f.m14183a(C11279p.m20001a(gVar.f43859a)).mo12816a(new AbstractC6656d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br.C71522 */

                static {
                    Covode.recordClassIndex(7898);
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: b */
                public final void mo11014b(String... strArr) {
                    C13628n.m24507a(gVar.f43859a, 2131234335, (int) R.string.gj4);
                    C7150br.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: a */
                public final void mo11013a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    if (C7150br.this.f17820b.getActivity() == null) {
                        C7150br.this.finishWithFailure();
                    } else {
                        C7150br.this.f17820b.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a
    /* renamed from: a */
    public final void mo13336a(int i, int i2, final Intent intent) {
        if (9001 != i && 9002 != i) {
            return;
        }
        if (-1 != i2 || intent == null || intent.getData() == null) {
            mo13373a();
            return;
        }
        ActivityC0945e activity = this.f17820b.getActivity();
        if (activity == null) {
            mo13373a();
            return;
        }
        final byte[] a = C11265g.m19961a(activity, intent.getData());
        if (a == null || a.length == 0) {
            mo13373a();
            return;
        }
        DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(activity);
        aVar.f22148c = false;
        aVar.f22147b = C3966y.m9657a((int) R.string.gqr);
        DialogC9146a a2 = aVar.mo15240a();
        this.f17821c = a2;
        a2.show();
        C6670f.m14183a(this.f17820b.getActivity()).mo12816a(new AbstractC6656d() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br.C71533 */

            static {
                Covode.recordClassIndex(7899);
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: b */
            public final void mo11014b(String... strArr) {
                C3854a.m9453a(3, "RecordVideoMethod", "onPermissionDenied: ");
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: a */
            public final void mo11013a(String... strArr) {
                C7150br brVar = C7150br.this;
                byte[] bArr = a;
                Uri data = intent.getData();
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, "temp" + System.currentTimeMillis()));
                ((UploadApi) C5805e.m12718a().mo11572a(UploadApi.class)).upload(multipartTypedOutput).mo142910a(new C11191f()).mo116431a_(new AbstractC88406ae<C5832d<C2996c>>(data) {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br.C71544 */

                    /* renamed from: a */
                    final /* synthetic */ Uri f17831a;

                    static {
                        Covode.recordClassIndex(7900);
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onSubscribe(AbstractC88412b bVar) {
                        C7150br.this.f17819a = bVar;
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onError(Throwable th) {
                        Context context;
                        if (!(C7150br.this.f17820b == null || (context = C7150br.this.f17820b.getContext()) == null)) {
                            C3886a.m9503a(context, th, null);
                        }
                        C7150br.this.mo13373a();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final /* synthetic */ void onSuccess(C5832d<C2996c> dVar) {
                        C7150br brVar = C7150br.this;
                        C2996c cVar = (C2996c) dVar.data;
                        Uri uri = this.f17831a;
                        if (brVar.f17821c != null) {
                            brVar.f17821c.dismiss();
                            brVar.f17821c = null;
                        }
                        try {
                            String str = cVar.f8817a;
                            C7019d.m14971a();
                            C7155a aVar = new C7155a(str, C7019d.m14972a(brVar.f17822d.f43859a, uri), (byte) 0);
                            brVar.f17822d.mo29356a("H5_uploadVideoStatus", aVar);
                            brVar.finishWithResult(aVar);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    {
                        this.f17831a = r2;
                    }
                });
            }
        }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
