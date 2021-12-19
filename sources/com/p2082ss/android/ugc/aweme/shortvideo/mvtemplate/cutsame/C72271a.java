package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.a */
public final class C72271a extends AbstractC72425c {

    /* renamed from: a */
    public int f162013a = -1;

    static {
        Covode.recordClassIndex(84937);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m127478a(this, viewGroup, i);
    }

    /* renamed from: c */
    private static MvImageChooseAdapter.MyMediaModel m127479c() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = new MvImageChooseAdapter.MyMediaModel(String.valueOf(System.currentTimeMillis()));
        myMediaModel.f134662b = "";
        myMediaModel.f134671k = "";
        myMediaModel.f134668h = 0;
        myMediaModel.f134667g = 4;
        return myMediaModel;
    }

    /* renamed from: d */
    private final void m127480d() {
        int i = this.f162013a;
        if (i >= 0 && i < getItemCount()) {
            notifyItemChanged(this.f162013a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: b */
    public final CutSameVideoImageExtraData mo114499b() {
        int a = mo114494a();
        if (a < 0 || a >= this.f162350c.size()) {
            return null;
        }
        return this.f162350c.get(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final int mo114494a() {
        int i = 0;
        for (T t : this.f162349b) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (m127747d(t)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114495a(int i) {
        if (i > 0) {
            int i2 = 1;
            while (true) {
                this.f162349b.add(m127479c());
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.f162013a = 0;
        notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: b */
    public final void mo114500b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        int a = mo114494a();
        if (a >= 0 && a < getItemCount()) {
            this.f162349b.remove(a);
            this.f162349b.add(a, myMediaModel);
            notifyItemChanged(a);
            this.f162013a = mo114494a();
            m127480d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114497a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f162349b.size();
            for (int i = 0; i < size; i++) {
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f162349b.get(i);
                C89219l.m154716b(myMediaModel2, "");
                if (C89219l.m154714a((Object) myMediaModel2.f134662b, (Object) myMediaModel.f134662b)) {
                    if (i >= 0) {
                        int a = mo114494a();
                        if (a == -1) {
                            this.f162013a = i;
                        } else if (a >= i) {
                            m127480d();
                            this.f162013a = i;
                        }
                        this.f162349b.remove(myMediaModel);
                        this.f162349b.add(i, m127479c());
                        notifyItemChanged(i);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114498a(ArrayList<CutSameVideoImageExtraData> arrayList) {
        if (!C84904k.m145909a(arrayList)) {
            if (arrayList == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(arrayList, "");
            this.f162350c = arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.a$a */
    public final class C72272a extends AbstractC72425c.C72427b {

        /* renamed from: a */
        final /* synthetic */ C72271a f162014a;

        static {
            Covode.recordClassIndex(84938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72272a(C72271a aVar, ViewGroup viewGroup) {
            super(aVar, viewGroup);
            C89219l.m154721d(viewGroup, "");
            this.f162014a = aVar;
        }

        /* renamed from: a */
        public final void mo114501a(MvImageChooseAdapter.MyMediaModel myMediaModel, C72272a aVar, int i) {
            C89219l.m154721d(aVar, "");
            super.mo114707a(myMediaModel, (AbstractC72425c.C72427b) aVar, i);
            this.f162356c.setVisibility(0);
            int i2 = 8;
            if (C72271a.m127747d(myMediaModel)) {
                this.f162357d.setVisibility(8);
                TextView textView = this.f162356c;
                Context context = this.f162356c.getContext();
                C89219l.m154716b(context, "");
                textView.setTextColor(context.getResources().getColor(R.color.bz));
                View view = this.f162358e;
                if (i == this.f162014a.f162013a) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            } else {
                this.f162357d.setVisibility(0);
                this.f162358e.setVisibility(8);
                TextView textView2 = this.f162356c;
                Context context2 = this.f162356c.getContext();
                C89219l.m154716b(context2, "");
                textView2.setTextColor(context2.getResources().getColor(R.color.a_));
            }
            C72271a aVar2 = this.f162014a;
            long j = 0;
            if (!C84904k.m145909a(aVar2.f162350c) && i >= 0 && i < aVar2.f162350c.size()) {
                j = aVar2.f162350c.get(i).f162012a;
            }
            TextView textView3 = this.f162356c;
            Context context3 = this.f162356c.getContext();
            C89219l.m154716b(context3, "");
            textView3.setText(context3.getResources().getString(R.string.dbp, Float.valueOf((1.0f * ((float) j)) / 1000.0f)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        C72272a aVar = (C72272a) viewHolder;
        aVar.mo114501a(this.f162349b.get(i), aVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114496a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f162349b.size() && adapterPosition2 < this.f162349b.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            MvImageChooseAdapter.MyMediaModel remove = this.f162349b.remove(adapterPosition);
            C89219l.m154716b(remove, "");
            this.f162349b.add(adapterPosition2, remove);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m127478a(C72271a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10007);
        C89219l.m154721d(viewGroup, "");
        C72272a aVar2 = new C72272a(aVar, viewGroup);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(10007);
        return aVar2;
    }
}
