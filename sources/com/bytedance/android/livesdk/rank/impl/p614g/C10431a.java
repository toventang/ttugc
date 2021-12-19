package com.bytedance.android.livesdk.rank.impl.p614g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.rank.api.model.C10349c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.g.a */
public final class C10431a extends AbstractC89396c<C10349c, C10432a> {
    static {
        Covode.recordClassIndex(12005);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10432a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C10432a(C1764a.m5927a(layoutInflater, R.layout.b9e, viewGroup, false));
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.a$a */
    class C10432a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f25142a;

        static {
            Covode.recordClassIndex(12006);
        }

        C10432a(View view) {
            super(view);
            this.f25142a = (TextView) view.findViewById(R.id.f07);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10432a aVar, C10349c cVar) {
        aVar.f25142a.setText(cVar.f25006a);
    }
}
