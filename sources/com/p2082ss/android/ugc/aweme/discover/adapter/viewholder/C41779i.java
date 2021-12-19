package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.i */
public final class C41779i extends AbstractView$OnAttachStateChangeListenerC41749a {

    /* renamed from: j */
    public static final C41780a f97455j = new C41780a((byte) 0);

    /* renamed from: i */
    public boolean f97456i;

    /* renamed from: k */
    private final CustomLayout f97457k;

    static {
        Covode.recordClassIndex(49694);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.i$a */
    public static final class C41780a {
        static {
            Covode.recordClassIndex(49695);
        }

        private C41780a() {
        }

        public /* synthetic */ C41780a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.i$b */
    public static final class C41781b implements CustomLayout.AbstractC41748a {

        /* renamed from: a */
        final /* synthetic */ C41779i f97458a;

        static {
            Covode.recordClassIndex(49696);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout.AbstractC41748a
        /* renamed from: a */
        public final void mo70929a() {
            this.f97458a.f97394b.setVisibility(8);
            this.f97458a.f97395c = false;
            this.f97458a.onPause();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41781b(C41779i iVar) {
            this.f97458a = iVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r8 == null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.AbstractView$OnAttachStateChangeListenerC41749a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70930a(com.p2082ss.android.ugc.aweme.discover.model.suggest.Word r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41779i.mo70930a(com.ss.android.ugc.aweme.discover.model.suggest.Word, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41779i(View view, AbstractC42664al.AbstractC42668d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view, dVar, searchIntermediateViewModel, fragment);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dnh);
        C89219l.m154716b(findViewById, "");
        this.f97457k = (CustomLayout) findViewById;
    }
}
