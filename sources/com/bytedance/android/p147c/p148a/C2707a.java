package com.bytedance.android.p147c.p148a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.livesdk.chatroom.p499ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.p147c.p148a.AbstractC2713c;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4550e.C88332a;
import p4550e.p4551a.C88333a;
import p4550e.p4556f.C88344a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.c.a.a */
public final class C2707a extends AbstractC2713c {

    /* renamed from: a */
    public AbstractC2708a f8086a;

    /* renamed from: com.bytedance.android.c.a.a$a */
    public interface AbstractC2708a extends AbstractC2713c.AbstractC2714a {
        static {
            Covode.recordClassIndex(3098);
        }

        /* renamed from: a */
        boolean mo7230a();

        /* renamed from: b */
        void mo7231b();
    }

    static {
        Covode.recordClassIndex(3097);
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final int mo7223a() {
        return 2131234371;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: c */
    public final void mo7227c() {
        AbstractC2708a aVar = this.f8086a;
        if (aVar != null) {
            aVar.mo7242b_();
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: e */
    public final void mo7229e() {
        AbstractC2708a aVar = this.f8086a;
        if (aVar != null) {
            aVar.mo7231b();
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: d */
    public final boolean mo7228d() {
        AbstractC2708a aVar = this.f8086a;
        if (aVar == null || !aVar.mo7230a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: b */
    public final /* synthetic */ CharSequence mo7226b() {
        String string = this.f8109l.getResources().getString(R.string.gv8);
        C89219l.m154716b(string, "");
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2707a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final void mo7225a(boolean z) {
        super.mo7225a(z);
        if (z) {
            C6501b.C6502a.m13948a("livesdk_emoji_show").mo12639a().mo12655b();
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final View mo7224a(ViewGroup viewGroup) {
        int i;
        C89219l.m154721d(viewGroup, "");
        Context context = this.f8109l;
        boolean z = this.f8104g;
        AbstractC2708a aVar = this.f8086a;
        C88344a aVar2 = new C88344a(context);
        aVar2.setOnEmojiSelectListener(aVar);
        if (z) {
            i = 7;
        } else {
            i = 12;
        }
        aVar2.f200546h = i;
        RecyclerView recyclerView = (RecyclerView) aVar2.findViewById(R.id.c_1);
        aVar2.f200545g = new C88333a(aVar2.getContext());
        aVar2.f200545g.f200534b = aVar2;
        recyclerView.setAdapter(aVar2.f200545g);
        aVar2.getContext();
        recyclerView.setLayoutManager(new SSGridLayoutManager(aVar2.f200546h, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(36);
        List<C2972a> a = C88332a.m153528a().f200531a.mo142855a();
        if (!C13617h.m24465a(a)) {
            ArrayList arrayList = new ArrayList(a);
            C88333a aVar3 = aVar2.f200545g;
            aVar3.f200533a.clear();
            if (!arrayList.isEmpty()) {
                aVar3.f200533a.addAll(arrayList);
            }
            aVar2.f200545g.notifyDataSetChanged();
        }
        C89219l.m154716b(aVar2, "");
        return aVar2;
    }
}
