package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2363ba.C34412d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71772l;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.z */
public class C70582z extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements AbstractC70081l {

    /* renamed from: a */
    public List<C70066ac> f157924a = new ArrayList();

    /* renamed from: b */
    public int f157925b = 0;

    /* renamed from: c */
    public AbstractC70584b f157926c;

    /* renamed from: d */
    public boolean f157927d = true;

    /* renamed from: e */
    protected VideoEditViewModel f157928e;

    /* renamed from: f */
    protected CutMultiVideoViewModel f157929f;

    /* renamed from: g */
    public C80332db f157930g;

    /* renamed from: h */
    public boolean f157931h = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.z$b */
    public interface AbstractC70584b {
        static {
            Covode.recordClassIndex(83048);
        }

        /* renamed from: a */
        void mo110976a(int i, String str);
    }

    static {
        Covode.recordClassIndex(83046);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m124677a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo111343a(List<VideoSegment> list) {
        this.f157924a.clear();
        for (VideoSegment videoSegment : list) {
            this.f157924a.add(new C70066ac(videoSegment.f156709a, videoSegment));
        }
    }

    /* renamed from: a */
    public final void mo111342a(VideoSegment videoSegment) {
        for (int i = 0; i < this.f157924a.size(); i++) {
            if (this.f157924a.get(i).f156680b.mo110571a(true).equals(videoSegment.mo110571a(true))) {
                this.f157924a.get(i).f156680b = videoSegment;
                notifyItemChanged(i);
                return;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.z$c */
    public class C70585c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public SimpleDraweeView f157933a = ((SimpleDraweeView) this.itemView.findViewById(R.id.fc8));

        /* renamed from: b */
        public VideoSegment f157934b;

        /* renamed from: d */
        private RelativeLayout f157936d = ((RelativeLayout) this.itemView.findViewById(R.id.dnk));

        /* renamed from: e */
        private TextView f157937e;

        static {
            Covode.recordClassIndex(83049);
        }

        /* renamed from: a */
        public final void mo111349a() {
            RelativeLayout relativeLayout = this.f157936d;
            if (relativeLayout != null) {
                relativeLayout.setScaleX(1.25f);
                this.f157936d.setScaleY(1.25f);
            }
        }

        /* renamed from: b */
        public final void mo111352b() {
            RelativeLayout relativeLayout = this.f157936d;
            if (relativeLayout != null) {
                relativeLayout.setScaleY(1.0f);
                this.f157936d.setScaleX(1.0f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo110987a(C70585c cVar) {
            this.itemView.setOnClickListener(new View$OnClickListenerC70065ab(this, cVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo111351a(C70585c cVar, String str) {
            C71772l.m126682a(cVar.f157933a, str, C84916a.m145947a(637534207, 637534207, 0, 0), C71812ep.m126783a(48.0d, C63247i.f143610a), C70582z.this.f157930g);
        }

        public C70585c(ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab5, viewGroup, false));
            C70082m.m123743a(this.f157933a);
            this.f157937e = (TextView) this.itemView.findViewById(R.id.dtz);
        }

        /* renamed from: a */
        public final void mo111350a(C70066ac acVar, C70585c cVar) {
            String str;
            this.f157934b = acVar.f156680b;
            if (TextUtils.isEmpty(acVar.f156680b.f156716h)) {
                str = acVar.f156680b.mo110571a(false);
            } else {
                str = acVar.f156680b.f156716h;
            }
            mo111351a(cVar, str);
            cVar.f157937e.setText(C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (acVar.f156680b.mo110580e() - acVar.f156680b.mo110578d())) / (acVar.f156680b.mo110582f() * 1000.0f))}) + "s");
            cVar.f157937e.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.a3));
            mo110987a(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        List<C70066ac> list = this.f157924a;
        if (list == null) {
            return 0;
        }
        boolean z = this.f157931h;
        int size = list.size();
        if (z) {
            return size + 1;
        }
        return size;
    }

    /* renamed from: b */
    public final long mo111344b() {
        long j = 0;
        if (C84904k.m145909a(this.f157924a)) {
            return 0;
        }
        for (C70066ac acVar : this.f157924a) {
            if (acVar != null && !acVar.f156680b.f156717i) {
                j += acVar.f156680b.f156710b;
            }
        }
        return j;
    }

    /* renamed from: a */
    public final ArrayList<String> mo111340a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (C84904k.m145909a(this.f157924a)) {
            return arrayList;
        }
        for (C70066ac acVar : this.f157924a) {
            if (acVar != null && !acVar.f156680b.f156717i) {
                if (C84896h.m145866a(acVar.f156680b.mo110571a(false), false)) {
                    arrayList.add(acVar.f156680b.f156716h);
                } else {
                    arrayList.add(acVar.f156680b.mo110571a(false));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.z$a */
    public class C70583a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(83047);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ void mo111348a(View view) {
            C70582z.this.mo110981a(view);
        }

        public C70583a(ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aay, viewGroup, false));
            ((DmtPlusView) this.itemView.findViewById(R.id.h3)).setBgColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo110981a(View view) {
        AbstractC70584b bVar = this.f157926c;
        if (bVar != null) {
            bVar.mo110976a(10003, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (i < this.f157924a.size()) {
            return 10002;
        }
        return 10003;
    }

    /* renamed from: a */
    public C70066ac mo110980a(int i) {
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return this.f157924a.get(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l
    /* renamed from: b */
    public final ViewPropertyAnimator mo110560b(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) this.f157924a.get(i).f156679a;
    }

    /* renamed from: b */
    public void mo111346b(VideoSegment videoSegment) {
        int i = 0;
        while (true) {
            if (i >= this.f157924a.size()) {
                break;
            } else if (this.f157924a.get(i).f156680b.mo110571a(true).equals(videoSegment.mo110571a(true))) {
                this.f157924a.remove(i);
                break;
            } else {
                i++;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo111347b(List<VideoSegment> list) {
        if (!C84904k.m145909a(list)) {
            if (this.f157924a == null) {
                this.f157924a = new ArrayList();
            }
            for (VideoSegment videoSegment : list) {
                this.f157924a.add(new C70066ac(videoSegment.f156709a, videoSegment));
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l
    /* renamed from: a */
    public void mo110557a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C70585c) {
            C70585c cVar = (C70585c) viewHolder;
            cVar.mo111349a();
            C70091f fVar = new C70091f(0, cVar.f157934b.f156709a, -1);
            fVar.f156758b = viewHolder.getAdapterPosition();
            this.f157929f.mo110476a(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C70585c) {
            C70585c cVar = (C70585c) viewHolder;
            cVar.mo111350a(mo110980a(i), cVar);
        } else if (viewHolder instanceof C70583a) {
            C70583a aVar = (C70583a) viewHolder;
            aVar.itemView.setOnClickListener(new View$OnClickListenerC70064aa(aVar));
        }
    }

    /* renamed from: a */
    public int mo110979a(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder f;
        C0692e<Integer, Integer> a = C34412d.m70402a(recyclerView);
        if (i < a.f2750a.intValue() || i > a.f2751b.intValue() || i >= getItemCount() || i < 0 || (f = recyclerView.mo4451f(i)) == null) {
            return -1;
        }
        int[] iArr = new int[2];
        f.itemView.getLocationOnScreen(iArr);
        return iArr[0] + C71812ep.m126783a(23.5d, C63247i.f143610a);
    }

    /* renamed from: b */
    public final Rect mo111345b(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder f;
        C0692e<Integer, Integer> a = C34412d.m70402a(recyclerView);
        if (i < a.f2750a.intValue() || i > a.f2751b.intValue() || i >= getItemCount() || i < 0 || (f = recyclerView.mo4451f(i)) == null || f.itemView == null) {
            return null;
        }
        int[] iArr = new int[2];
        f.itemView.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + f.itemView.getWidth(), iArr[1] + f.itemView.getHeight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111341a(int i, int i2) {
        this.f157928e.mo111232k().add(i2, this.f157928e.mo111232k().remove(i));
        int i3 = 0;
        for (VideoSegment videoSegment : this.f157928e.mo111232k()) {
            videoSegment.f156709a = i3;
            i3++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l
    /* renamed from: a */
    public void mo110558a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f157924a.size() && adapterPosition2 < this.f157924a.size()) {
            int i = ((C70585c) viewHolder).f157934b.f156709a;
            int i2 = ((C70585c) viewHolder2).f157934b.f156709a;
            this.f157924a.add(adapterPosition2, this.f157924a.remove(adapterPosition));
            mo111341a(i, i2);
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f157929f.mo110476a(new C70091f(1, i, i2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l
    /* renamed from: a */
    public void mo110559a(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder instanceof C70585c) {
            C70585c cVar = (C70585c) viewHolder;
            cVar.mo111352b();
            C70091f fVar = new C70091f(2, -1, cVar.f157934b.f156709a);
            fVar.f156757a = z;
            fVar.f156759c = viewHolder.getAdapterPosition();
            this.f157929f.mo110476a(fVar);
        }
    }

    public C70582z(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.f157928e = videoEditViewModel;
        this.f157929f = cutMultiVideoViewModel;
        mo111343a(list);
        setHasStableIds(true);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m124677a(C70582z zVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(12543);
        if (i == 10003) {
            viewHolder = new C70583a(viewGroup);
        } else {
            viewHolder = new C70585c(viewGroup);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(12543);
        return viewHolder;
    }
}
