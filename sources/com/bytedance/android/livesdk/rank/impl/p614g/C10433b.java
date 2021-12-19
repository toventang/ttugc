package com.bytedance.android.livesdk.rank.impl.p614g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.api.model.C10350d;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.g.b */
public final class C10433b extends AbstractC89396c<C10350d, C10434a> {

    /* renamed from: a */
    private EnumC10608a f25144a;

    static {
        Covode.recordClassIndex(12007);
    }

    public C10433b(EnumC10608a aVar) {
        this.f25144a = aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.b$a */
    static class C10434a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final LiveTextView f25145a;

        /* renamed from: b */
        public final LiveTextView f25146b;

        /* renamed from: c */
        public final ImageView f25147c;

        static {
            Covode.recordClassIndex(12008);
        }

        C10434a(View view) {
            super(view);
            this.f25145a = (LiveTextView) view.findViewById(R.id.f6c);
            this.f25146b = (LiveTextView) view.findViewById(R.id.ett);
            this.f25147c = (ImageView) view.findViewById(R.id.bid);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10434a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C10434a(C1764a.m5927a(layoutInflater, R.layout.b9f, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10434a aVar, C10350d dVar) {
        C10434a aVar2 = aVar;
        C10350d dVar2 = dVar;
        aVar2.f25145a.setText(dVar2.f25007a);
        aVar2.f25146b.setText(dVar2.f25008b);
        if (this.f25144a != EnumC10608a.BOTH_REVENUE) {
            aVar2.f25147c.setVisibility(8);
            aVar2.f25147c.setVisibility(8);
        }
    }
}
