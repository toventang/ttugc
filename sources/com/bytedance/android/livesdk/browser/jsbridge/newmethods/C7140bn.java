package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.core.p215e.p217b.C3886a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p379n.AbstractC5773g;
import com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11275l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn */
public final class C7140bn extends AbstractC18334e<C7142a, C7143b> implements AbstractC5773g.AbstractC5774a, AbstractC7044a {

    /* renamed from: a */
    AbstractC5773g f17781a;

    /* renamed from: b */
    public Fragment f17782b;

    /* renamed from: c */
    public AbstractC88412b f17783c;

    /* renamed from: d */
    private int f17784d;

    static {
        Covode.recordClassIndex(7886);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn$a */
    static final class C7142a {
        @AbstractC27891c(mo46611a = "aspect_x")

        /* renamed from: a */
        int f17787a;
        @AbstractC27891c(mo46611a = "aspect_y")

        /* renamed from: b */
        int f17788b;
        @AbstractC27891c(mo46611a = "min_width")

        /* renamed from: c */
        int f17789c;
        @AbstractC27891c(mo46611a = "min_height")

        /* renamed from: d */
        int f17790d;
        @AbstractC27891c(mo46611a = "max_size")

        /* renamed from: e */
        int f17791e;

        static {
            Covode.recordClassIndex(7888);
        }

        C7142a() {
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9127a() {
        mo13370b();
    }

    /* renamed from: b */
    public final void mo13370b() {
        AbstractC5773g gVar = this.f17781a;
        if (gVar != null) {
            gVar.mo11515b();
            this.f17781a = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17783c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f17782b = null;
        this.f17781a.mo11515b();
    }

    public C7140bn(Fragment fragment) {
        this.f17782b = fragment;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn$b */
    static final class C7143b {
        @AbstractC27891c(mo46611a = "uri")

        /* renamed from: a */
        String f17792a;
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: b */
        String f17793b;

        static {
            Covode.recordClassIndex(7889);
        }

        private C7143b(String str, String str2) {
            this.f17792a = str;
            this.f17793b = str2;
        }

        /* synthetic */ C7143b(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7142a aVar, C18338g gVar) {
        int i;
        C7142a aVar2 = aVar;
        if (aVar2.f17791e > 0) {
            i = aVar2.f17791e;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f17784d = i;
        AbstractC5773g a = C11275l.m19979a(null, this.f17782b, "upload_photo_method", aVar2.f17787a, aVar2.f17788b, aVar2.f17789c, aVar2.f17790d, this);
        this.f17781a = a;
        a.mo11516c();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9128a(final String str, String str2) {
        this.f17781a.mo11513a();
        File file = new File(str);
        if (!file.exists()) {
            mo13370b();
            return;
        }
        long length = file.length();
        int i = this.f17784d;
        if (length >= ((long) i)) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.gpg, Integer.valueOf((i / 1024) / 1024)), 0);
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
        ((UploadApi) C5805e.m12718a().mo11572a(UploadApi.class)).upload(multipartTypedOutput).mo142910a(new C11191f()).mo116431a_(new AbstractC88406ae<C5832d<C2996c>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7140bn.C71411 */

            static {
                Covode.recordClassIndex(7887);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C7140bn.this.f17783c = bVar;
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                Context context = C7140bn.this.f17782b.getContext();
                if (context != null) {
                    C3886a.m9503a(context, th, null);
                }
                C7140bn.this.mo13370b();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C5832d<C2996c> dVar) {
                C5832d<C2996c> dVar2 = dVar;
                ((C2996c) dVar2.data).f8818b = str;
                C7140bn bnVar = C7140bn.this;
                C2996c cVar = (C2996c) dVar2.data;
                String str = str;
                if (bnVar.f17781a != null) {
                    bnVar.f17781a.mo11515b();
                    bnVar.f17781a = null;
                }
                String str2 = cVar.f8817a;
                C7019d.m14971a();
                bnVar.finishWithResult(new C7143b(str2, C7019d.m14973a(str), (byte) 0));
            }
        });
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a
    /* renamed from: a */
    public final void mo13336a(int i, int i2, Intent intent) {
        AbstractC5773g gVar = this.f17781a;
        if (gVar != null) {
            gVar.mo11514a(i, i2, intent);
        }
    }
}
