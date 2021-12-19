package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.content.Context;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager */
public final class ChatLinearLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: d */
    public static final C54450a f124732d = new C54450a((byte) 0);

    /* renamed from: a */
    public boolean f124733a = true;

    /* renamed from: b */
    public final String f124734b = "ChatLinearLayoutManager";

    /* renamed from: c */
    public final Context f124735c;

    static {
        Covode.recordClassIndex(64156);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager$a */
    public static final class C54450a {
        static {
            Covode.recordClassIndex(64157);
        }

        private C54450a() {
        }

        public /* synthetic */ C54450a(byte b) {
            this();
        }
    }

    /* renamed from: C */
    public final int mo91519C() {
        if (this.f4336l) {
            return mo4373m();
        }
        return mo4371k();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        if (!this.f124733a || !super.mo4368g()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager$b */
    public static final class C54451b extends C1481r {

        /* renamed from: f */
        final /* synthetic */ RecyclerView f124736f;

        static {
            Covode.recordClassIndex(64158);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5014b(int i) {
            if (i >= 3000) {
                i = 3000;
            }
            return super.mo5014b(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54451b(RecyclerView recyclerView, Context context) {
            super(context);
            this.f124736f = recyclerView;
        }
    }

    public ChatLinearLayoutManager(Context context) {
        C89219l.m154721d(context, "");
        this.f124735c = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i, com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        super.mo4337c(oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        C54451b bVar = new C54451b(recyclerView, recyclerView.getContext());
        bVar.f4515g = i;
        mo4695a(bVar);
    }
}
