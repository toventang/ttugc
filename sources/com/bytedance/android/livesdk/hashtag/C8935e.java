package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.livesdk.hashtag.C8967l;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.e */
public final class C8935e extends RecyclerView.AbstractC1350a<C8967l> {

    /* renamed from: a */
    public Context f22009a;

    /* renamed from: b */
    public DataChannel f22010b;

    /* renamed from: c */
    public AbstractC89172b<? super Hashtag, C89391z> f22011c;

    /* renamed from: d */
    private List<Hashtag> f22012d;

    /* renamed from: e */
    private final boolean f22013e;

    static {
        Covode.recordClassIndex(9827);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C8967l onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m17278a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f22012d.size();
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.e$a */
    static final /* synthetic */ class C8936a extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(9828);
        }

        C8936a(C8935e eVar) {
            super(0, eVar, C8935e.class, "notifyDataSetChanged", "notifyDataSetChanged()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((RecyclerView.AbstractC1350a) this.receiver).notifyDataSetChanged();
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C8967l lVar, int i) {
        Hashtag hashtag;
        C8967l lVar2 = lVar;
        C89219l.m154721d(lVar2, "");
        Hashtag hashtag2 = this.f22012d.get(i);
        DataChannel dataChannel = this.f22010b;
        boolean z = this.f22013e;
        C8936a aVar = new C8936a(this);
        AbstractC89172b<? super Hashtag, C89391z> bVar = this.f22011c;
        C89219l.m154721d(hashtag2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C3951p.m9631b(lVar2.f22070a, hashtag2.image, 2131234133, 8);
        lVar2.f22071b.setText(hashtag2.title);
        if (dataChannel == null || (hashtag = (Hashtag) dataChannel.mo28318b(C9023aq.class)) == null) {
            lVar2.f22072c.setChecked(false);
        } else {
            lVar2.f22072c.setChecked(C89219l.m154714a(hashtag.f23083id, hashtag2.f23083id));
        }
        LiveRadioButton liveRadioButton = lVar2.f22072c;
        liveRadioButton.setOnClickListener(new C8967l.View$OnClickListenerC8968a(liveRadioButton, z, aVar, dataChannel, hashtag2, bVar));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m17278a(C8935e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(2383);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(eVar.f22009a), R.layout.b98, viewGroup, false);
        C89219l.m154716b(a2, "");
        C8967l lVar = new C8967l(a2);
        try {
            if (lVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(lVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) lVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(lVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = lVar.getClass().getName();
        MethodCollector.m26664o(2383);
        return lVar;
    }

    public C8935e(Context context, List<Hashtag> list, DataChannel dataChannel, boolean z, AbstractC89172b<? super Hashtag, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f22009a = context;
        this.f22012d = list;
        this.f22010b = dataChannel;
        this.f22013e = z;
        this.f22011c = bVar;
    }
}
