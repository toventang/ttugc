package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3237g;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p379n.AbstractC5773g;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.imagepipeline.p1890o.C24639c;
import java.io.File;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.widget.f */
public final /* synthetic */ class C3785f implements AbstractC5773g.AbstractC5774a {

    /* renamed from: a */
    private final View$OnClickListenerC3783e f10500a;

    static {
        Covode.recordClassIndex(4311);
    }

    C3785f(View$OnClickListenerC3783e eVar) {
        this.f10500a = eVar;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9127a() {
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9128a(String str, String str2) {
        View$OnClickListenerC3783e eVar = this.f10500a;
        eVar.f10492e = str2;
        eVar.f10491d.mo11513a();
        File file = new File(str);
        if (!file.exists()) {
            eVar.mo9120a(new Exception("avatar file don't exists in path ".concat(String.valueOf(str))));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3719d.C3720a.m9229a().mo9040b().uploadAvatar(multipartTypedOutput).mo142910a(new C11191f()).mo116431a_(new AbstractC88406ae<C5832d<C2993a>>(str) {
            /* class com.bytedance.android.live.broadcast.widget.View$OnClickListenerC3783e.C37841 */

            /* renamed from: a */
            final /* synthetic */ String f10498a;

            static {
                Covode.recordClassIndex(4310);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                View$OnClickListenerC3783e.this.f10493f.mo142945a(bVar);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                View$OnClickListenerC3783e.this.mo9120a(th);
                C6497a b = C3049b.C3050a.m8358b("ttlive_upload_cover_all", th);
                b.f16149e = true;
                b.mo12632a();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C5832d<C2993a> dVar) {
                Object valueOf;
                String obj;
                C5832d<C2993a> dVar2 = dVar;
                ((C2993a) dVar2.data).f8815c = this.f10498a;
                View$OnClickListenerC3783e eVar = View$OnClickListenerC3783e.this;
                C2993a aVar = (C2993a) dVar2.data;
                if (!eVar.f10490c.isViewValid()) {
                    eVar.f10492e = null;
                } else {
                    HSImageView hSImageView = eVar.f10488a;
                    String str = aVar.f8815c;
                    if (hSImageView != null && !TextUtils.isEmpty(str)) {
                        if (!str.startsWith("file://")) {
                            str = "file://".concat(String.valueOf(str));
                        }
                        hSImageView.setImageURI(C24639c.m47149a(Uri.parse(str)).mo40483a().mSourceUri);
                    }
                    eVar.f10494g.mo28311a(C3237g.class, "new_cover");
                    eVar.f10495h = false;
                    eVar.f10489b.setAlpha(1.0f);
                    eVar.f10491d.mo11515b();
                    if (!TextUtils.isEmpty(aVar.f8813a)) {
                        eVar.f10496i = aVar;
                    }
                    C6501b a = C6501b.C6502a.m13948a("livesdk_cover_modify_over").mo12643a(eVar.f10494g).mo12656c("click").mo12654b("live").mo12658d("cover_edit").mo12651a("live_type", eVar.mo9122c()).mo12651a("shooting_date", eVar.f10492e).mo12651a("current_date", String.valueOf(System.currentTimeMillis())).mo12651a("cover_url", eVar.f10496i.f8813a);
                    Object obj2 = "0";
                    if (eVar.f10497j == null) {
                        valueOf = obj2;
                    } else {
                        valueOf = String.valueOf(eVar.f10497j.getId());
                    }
                    a.mo12651a("anchor_id", String.valueOf(valueOf)).mo12655b();
                    eVar.f10492e = null;
                    User user = (User) C11115u.m19743a().mo17915b().mo13147a();
                    C6501b a2 = C6501b.C6502a.m13948a("pm_live_photo_upload").mo12643a(eVar.f10494g).mo12656c("click").mo12654b("live").mo12651a("live_type", eVar.mo9122c());
                    if (user != null) {
                        obj2 = Long.valueOf(user.getId());
                    }
                    a2.mo12651a("anchor_id", String.valueOf(obj2)).mo12655b();
                }
                C2993a aVar2 = (C2993a) dVar2.data;
                if (aVar2 == null) {
                    C6497a d = C3051c.C3052a.m8362d("ttlive_upload_cover_all");
                    d.f16147c = true;
                    d.mo12632a();
                    return;
                }
                String str2 = aVar2.f8813a;
                if (aVar2.f8814b == null) {
                    obj = "";
                } else {
                    obj = aVar2.f8814b.toString();
                }
                C6497a a3 = C3051c.C3052a.m8360b("ttlive_upload_cover_all").mo12629a("cover", str2).mo12629a("cover_list", obj);
                a3.f16147c = true;
                a3.mo12632a();
            }

            {
                this.f10498a = r2;
            }
        });
        eVar.f10492e = str2;
    }
}
