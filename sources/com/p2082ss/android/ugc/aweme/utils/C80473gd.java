package com.p2082ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.block.C12390g;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b;
import com.p2082ss.android.ugc.aweme.p2340at.C33964i;
import com.p2082ss.android.ugc.aweme.p2340at.C33968k;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.gd */
public final class C80473gd implements AbstractC80321cz {

    /* renamed from: d */
    public static final C80474a f180054d = new C80474a((byte) 0);

    /* renamed from: a */
    public C33964i f180055a;

    /* renamed from: b */
    public final String f180056b;

    /* renamed from: c */
    public final boolean f180057c = false;

    /* renamed from: e */
    private C12616b f180058e;

    /* renamed from: f */
    private boolean f180059f;

    /* renamed from: g */
    private long f180060g;

    /* renamed from: h */
    private long f180061h;

    /* renamed from: i */
    private AbstractC80347dl f180062i;

    static {
        Covode.recordClassIndex(93741);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: c */
    public final void mo123701c() {
        this.f180062i = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gd$a */
    public static final class C80474a {
        static {
            Covode.recordClassIndex(93742);
        }

        private C80474a() {
        }

        public /* synthetic */ C80474a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: a */
    public final void mo123697a() {
        C12390g.m22259a(this.f180056b);
        if (!this.f180059f) {
            this.f180059f = true;
            this.f180060g = SystemClock.uptimeMillis();
            C12616b bVar = this.f180058e;
            if (bVar != null) {
                bVar.mo20427a();
            }
            AbstractC80347dl dlVar = this.f180062i;
            if (dlVar != null) {
                dlVar.mo70708a(this.f180056b);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: b */
    public final void mo123700b() {
        C12390g.m22260b(this.f180056b);
        if (this.f180059f) {
            this.f180059f = false;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f180061h = uptimeMillis;
            C33964i iVar = this.f180055a;
            if (iVar != null) {
                iVar.f80329a = uptimeMillis - this.f180060g;
            }
            C12616b bVar = this.f180058e;
            if (bVar != null) {
                bVar.mo20430b();
            }
            AbstractC80347dl dlVar = this.f180062i;
            if (dlVar != null) {
                dlVar.mo70709b(this.f180056b);
            }
            this.f180060g = 0;
            this.f180061h = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gd$d */
    public static final class C80477d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C80473gd f180065a;

        static {
            Covode.recordClassIndex(93745);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C80477d(C80473gd gdVar) {
            this.f180065a = gdVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i != 0) {
                this.f180065a.mo123697a();
            } else {
                this.f180065a.mo123700b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gd$e */
    public static final class C80478e extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C80473gd f180066a;

        static {
            Covode.recordClassIndex(93746);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C80478e(C80473gd gdVar) {
            this.f180066a = gdVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f180066a.mo123697a();
            } else {
                this.f180066a.mo123700b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gd$b */
    static final class C80475b implements C12616b.AbstractC12623d {

        /* renamed from: a */
        final /* synthetic */ C80473gd f180063a;

        static {
            Covode.recordClassIndex(93743);
        }

        C80475b(C80473gd gdVar) {
            this.f180063a = gdVar;
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12623d
        /* renamed from: a */
        public final void mo20436a(double d) {
            C33964i iVar = this.f180063a.f180055a;
            if (iVar != null) {
                iVar.f80330b = d;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gd$c */
    static final class C80476c implements C12616b.AbstractC12622c {

        /* renamed from: a */
        final /* synthetic */ C80473gd f180064a;

        static {
            Covode.recordClassIndex(93744);
        }

        C80476c(C80473gd gdVar) {
            this.f180064a = gdVar;
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12622c
        /* renamed from: a */
        public final void mo20435a(JSONObject jSONObject) {
            C33964i iVar = this.f180064a.f180055a;
            if (iVar != null) {
                iVar.mo20435a(jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: a */
    public final AbstractC80321cz mo123695a(AbstractC80347dl dlVar) {
        C89219l.m154721d(dlVar, "");
        this.f180062i = dlVar;
        return this;
    }

    public C80473gd(String str) {
        C89219l.m154721d(str, "");
        this.f180056b = str;
        this.f180058e = new C12616b(str, C33964i.C33965a.m69557a(str));
        this.f180055a = new C33964i(str);
        C12616b bVar = this.f180058e;
        if (bVar != null) {
            bVar.mo20429a(new C80475b(this));
        }
        C12616b bVar2 = this.f180058e;
        if (bVar2 != null) {
            bVar2.mo20428a(new C80476c(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: a */
    public final void mo123698a(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.f180056b, "user_profile")) {
            C33968k.m69560a(this.f180056b);
        }
        if (recyclerView != null) {
            recyclerView.mo4405a(new C80477d(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: a */
    public final void mo123699a(AbstractC39190b bVar) {
        C33968k.m69560a(this.f180056b);
        if (bVar != null) {
            bVar.mo67974a(new C80478e(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz
    /* renamed from: a */
    public final AbstractC80321cz mo123696a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C33964i iVar = this.f180055a;
        if (iVar != null) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            iVar.f80331c.put(str, str2);
        }
        return this;
    }
}
