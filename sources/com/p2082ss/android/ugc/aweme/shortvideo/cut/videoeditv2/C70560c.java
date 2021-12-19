package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c */
public final class C70560c extends RecyclerView.AbstractC1350a<C70561a> {

    /* renamed from: a */
    public float f157813a;

    /* renamed from: b */
    public List<C89378p<Integer, Integer>> f157814b = new ArrayList();

    /* renamed from: c */
    public List<VideoSegment> f157815c = new ArrayList();

    /* renamed from: d */
    public int f157816d;

    /* renamed from: e */
    public int f157817e;

    /* renamed from: f */
    public float f157818f;

    /* renamed from: g */
    public Context f157819g;

    /* renamed from: h */
    public VEMediaParserProviderV2 f157820h;

    /* renamed from: i */
    public int f157821i;

    /* renamed from: j */
    private int f157822j;

    static {
        Covode.recordClassIndex(83023);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C70561a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m124614a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f157815c.isEmpty()) {
            return 0;
        }
        return this.f157822j;
    }

    /* renamed from: a */
    public final void mo111308a(int i) {
        this.f157817e = i;
        this.f157820h.f157773e = i;
    }

    /* renamed from: a */
    public final void mo111311a(boolean z) {
        this.f157820h.f157769a = z;
    }

    /* renamed from: a */
    private final int m124613a(float f) {
        float ceil = (float) Math.ceil((double) (f / this.f157813a));
        if (Float.isNaN(ceil)) {
            return 0;
        }
        return C89241a.m154730a(ceil);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewRecycled(C70561a aVar) {
        C70561a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        super.onViewRecycled(aVar2);
        aVar2.f157823a.setImageBitmap(null);
        Bitmap bitmap = aVar2.f157824b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        aVar2.f157824b = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c$a */
    public final class C70561a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f157823a;

        /* renamed from: b */
        public Bitmap f157824b;

        /* renamed from: c */
        final /* synthetic */ C70560c f157825c;

        static {
            Covode.recordClassIndex(83024);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c$a$a */
        public static final class C70562a implements AbstractC70557a {

            /* renamed from: a */
            final /* synthetic */ C70561a f157826a;

            /* renamed from: b */
            final /* synthetic */ C70561a f157827b;

            /* renamed from: c */
            final /* synthetic */ String f157828c;

            static {
                Covode.recordClassIndex(83025);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractC70557a
            /* renamed from: a */
            public final void mo111302a(Bitmap bitmap) {
                C89219l.m154721d(bitmap, "");
                if (C89219l.m154714a(this.f157827b.f157823a.getTag(), (Object) this.f157828c)) {
                    this.f157826a.f157823a.setImageBitmap(bitmap);
                    Bitmap bitmap2 = this.f157826a.f157824b;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f157826a.f157824b = null;
                    this.f157826a.f157824b = bitmap;
                }
            }

            C70562a(C70561a aVar, C70561a aVar2, String str) {
                this.f157826a = aVar;
                this.f157827b = aVar2;
                this.f157828c = str;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70561a(C70560c cVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f157825c = cVar;
            this.f157823a = (ImageView) view;
        }
    }

    /* renamed from: b */
    private final int m124615b(float f) {
        this.f157814b.clear();
        int i = 0;
        if (this.f157821i == 1) {
            for (VideoSegment videoSegment : this.f157815c) {
                int a = m124613a(((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / videoSegment.mo110582f());
                List<C89378p<Integer, Integer>> list = this.f157814b;
                Integer valueOf = Integer.valueOf(i);
                i += a;
                list.add(new C89378p<>(valueOf, Integer.valueOf(i - 1)));
            }
            return i;
        }
        VideoSegment videoSegment2 = this.f157815c.get(0);
        this.f157818f = videoSegment2.mo110582f();
        if (f != 0.0f) {
            this.f157818f = f;
        }
        int a2 = m124613a(((float) videoSegment2.f156710b) / this.f157818f);
        this.f157814b.add(new C89378p<>(0, Integer.valueOf(a2 - 1)));
        return a2;
    }

    /* renamed from: a */
    public final void mo111309a(List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        this.f157815c = new ArrayList(list);
        this.f157822j = m124615b(0.0f);
        this.f157820h.mo111282d();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo111306a(float f, float f2) {
        mo111312b(f, f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo111312b(float f, float f2) {
        this.f157813a = f * ((float) this.f157816d);
        this.f157822j = m124615b(f2);
        this.f157820h.mo111282d();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo111307a(float f, VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        this.f157815c.clear();
        this.f157815c.add(videoSegment);
        mo111312b(f, 0.0f);
    }

    /* renamed from: a */
    public final void mo111310a(List<? extends VideoSegment> list, float f) {
        C89219l.m154721d(list, "");
        this.f157815c = new ArrayList(list);
        mo111312b(f, 0.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C70561a aVar, int i) {
        float min;
        float floatValue;
        C70561a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar2, "");
        int size = aVar2.f157825c.f157814b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C89378p<Integer, Integer> pVar = aVar2.f157825c.f157814b.get(i2);
            if (i >= pVar.getFirst().intValue() && i <= pVar.getSecond().intValue()) {
                C89378p<Integer, Integer> pVar2 = aVar2.f157825c.f157814b.get(i2);
                VideoSegment videoSegment = aVar2.f157825c.f157815c.get(i2);
                if (aVar2.f157825c.f157821i == 1) {
                    min = Math.min((((float) (i - pVar2.getFirst().intValue())) * aVar2.f157825c.f157813a * videoSegment.mo110582f()) + ((float) videoSegment.mo110578d()), (float) videoSegment.mo110580e());
                } else {
                    min = Math.min(((float) (i - pVar2.getFirst().intValue())) * aVar2.f157825c.f157813a * aVar2.f157825c.f157818f, (float) videoSegment.f156710b);
                }
                String sb = new StringBuilder().append(i2).append('-').append(min).toString();
                aVar2.f157823a.setTag(sb);
                View view = aVar2.itemView;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
                jVar.height = aVar2.f157825c.f157817e;
                jVar.width = aVar2.f157825c.f157816d;
                if (i == pVar2.getSecond().intValue()) {
                    if (aVar2.f157825c.f157821i == 1) {
                        floatValue = (((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / videoSegment.mo110582f()) - (aVar2.f157825c.f157813a * ((float) (pVar2.getSecond().intValue() - pVar2.getFirst().intValue())));
                    } else {
                        floatValue = (((float) videoSegment.f156710b) / aVar2.f157825c.f157818f) - (aVar2.f157825c.f157813a * pVar2.getSecond().floatValue());
                    }
                    if (floatValue >= 0.0f) {
                        jVar.width = C89241a.m154730a((floatValue / aVar2.f157825c.f157813a) * ((float) aVar2.f157825c.f157816d));
                    }
                }
                View view2 = aVar2.itemView;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(jVar);
                Bitmap bitmap = aVar2.f157824b;
                if (bitmap != null && bitmap.isRecycled()) {
                    ImageView imageView = aVar2.f157823a;
                    if (aVar2.f157825c.f157821i == 1) {
                        imageView.setBackground(aVar2.f157825c.f157819g.getResources().getDrawable(2131230977));
                    } else {
                        imageView.setBackground(aVar2.f157825c.f157819g.getResources().getDrawable(2131230983));
                    }
                }
                String a = aVar2.f157825c.f157815c.get(i2).mo110571a(false);
                VEMediaParserProviderV2 vEMediaParserProviderV2 = aVar2.f157825c.f157820h;
                C89219l.m154716b(a, "");
                C70561a.C70562a aVar3 = new C70561a.C70562a(aVar2, aVar2, sb);
                C89219l.m154721d(a, "");
                C89219l.m154721d(aVar3, "");
                vEMediaParserProviderV2.mo111279a(i, a, (int) min, (AbstractC70557a) aVar3, true);
                return;
            }
        }
        throw new IllegalArgumentException("unknow pos = ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m124614a(C70560c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12265);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(cVar.f157819g), R.layout.a_s, viewGroup, false);
        C89219l.m154716b(a2, "");
        C70561a aVar = new C70561a(cVar, a2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(12265);
        return aVar;
    }

    public C70560c(Context context, int[] iArr, float f, VEMediaParserProviderV2 vEMediaParserProviderV2, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(vEMediaParserProviderV2, "");
        this.f157819g = context;
        this.f157820h = vEMediaParserProviderV2;
        this.f157821i = i;
        int i2 = iArr[0];
        this.f157816d = i2;
        this.f157817e = iArr[1];
        this.f157813a = f * ((float) i2);
    }
}
