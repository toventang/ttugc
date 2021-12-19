package com.p2082ss.android.ugc.aweme.autoplay.player;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.xsearch.C81686a;
import com.p2082ss.android.ugc.aweme.xsearch.C81691f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.c */
public final class View$OnAttachStateChangeListenerC34193c implements View.OnAttachStateChangeListener {

    /* renamed from: e */
    public static final C34194a f80848e = new C34194a((byte) 0);

    /* renamed from: a */
    public final C51060g f80849a;

    /* renamed from: b */
    public final AbstractC51043a f80850b;

    /* renamed from: c */
    public final AbstractC51044b f80851c;

    /* renamed from: d */
    public final RecyclerView f80852d;

    static {
        Covode.recordClassIndex(41127);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.c$a */
    public static final class C34194a {
        static {
            Covode.recordClassIndex(41128);
        }

        private C34194a() {
        }

        public /* synthetic */ C34194a(byte b) {
            this();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = this.f80852d;
        C89219l.m154721d(recyclerView, "");
        if (C81691f.m141556a().containsKey(recyclerView)) {
            C81691f.m141556a().remove(recyclerView);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        C81686a aVar = new C81686a(this.f80849a, this.f80850b, this.f80851c);
        RecyclerView recyclerView = this.f80852d;
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        if (!C81691f.m141556a().containsKey(recyclerView)) {
            C81691f.m141556a().put(recyclerView, aVar);
        }
    }

    public View$OnAttachStateChangeListenerC34193c(C51060g gVar, AbstractC51043a aVar, AbstractC51044b bVar, RecyclerView recyclerView) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(recyclerView, "");
        this.f80849a = gVar;
        this.f80850b = aVar;
        this.f80851c = bVar;
        this.f80852d = recyclerView;
    }
}
