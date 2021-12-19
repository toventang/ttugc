package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74266a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b */
public final class C70520b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public int f157706a;

    /* renamed from: b */
    public Context f157707b;

    /* renamed from: c */
    public HashMap<String, Float> f157708c = new HashMap<>();

    /* renamed from: d */
    public List<C0692e<String, C0692e<Integer, Integer>>> f157709d;

    /* renamed from: e */
    public AbstractC70092g f157710e;

    /* renamed from: f */
    public List<VideoSegment> f157711f = new ArrayList();

    /* renamed from: g */
    public List<VideoSegment> f157712g;

    /* renamed from: h */
    public C1213t<Bitmap> f157713h;

    /* renamed from: i */
    public C1213t<Boolean> f157714i;

    /* renamed from: j */
    public int f157715j;

    /* renamed from: k */
    public int f157716k;

    /* renamed from: l */
    public int f157717l;

    /* renamed from: m */
    public C74297p f157718m;

    /* renamed from: n */
    public List<Bitmap> f157719n = new ArrayList();

    /* renamed from: o */
    public boolean f157720o;

    /* renamed from: p */
    public AbstractC31071f f157721p;

    /* renamed from: q */
    private boolean f157722q;

    static {
        Covode.recordClassIndex(82976);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m124525a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo111247a(boolean z) {
        AbstractC70092g gVar = this.f157710e;
        if (gVar instanceof C74266a) {
            ((C74266a) gVar).f167008b = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111240a() {
        AbstractC70092g gVar = this.f157710e;
        if (gVar != null) {
            gVar.mo110503b();
        }
    }

    /* renamed from: b */
    private void m124527b() {
        if (this.f157720o) {
            int a = m124524a((int) this.f157711f.get(0).f156710b, this.f157711f.get(0).mo110571a(true));
            C71993c a2 = new C71993c().mo114167a(this.f157715j, this.f157716k);
            a2.f161339m = this.f157714i;
            a2.f161338l = this.f157713h;
            a2.mo114168a(this.f157707b, this.f157721p, a, new C70522c(this));
        }
        notifyDataSetChanged();
    }

    /* renamed from: c */
    private void m124529c() {
        int a;
        List<C0692e<String, C0692e<Integer, Integer>>> list = this.f157709d;
        if (list == null) {
            this.f157709d = new ArrayList();
        } else {
            list.clear();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f157711f.size(); i2++) {
            VideoSegment videoSegment = this.f157711f.get(i2);
            if (this.f157706a == 1) {
                a = m124524a((int) (videoSegment.mo110580e() - videoSegment.mo110578d()), videoSegment.mo110571a(true));
            } else {
                a = m124524a((int) videoSegment.f156710b, videoSegment.mo110571a(true));
            }
            Integer valueOf = Integer.valueOf(i);
            i += a;
            this.f157709d.add(C0692e.m2449a(videoSegment.mo110571a(true), C0692e.m2449a(valueOf, Integer.valueOf(i - 1))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int a;
        if (this.f157720o) {
            return this.f157719n.size();
        }
        C74297p pVar = this.f157718m;
        if (pVar != null) {
            return pVar.f167074a;
        }
        if (C84892d.m145850a(this.f157711f)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f157711f.size(); i2++) {
            if (this.f157706a == 1) {
                a = m124524a((int) (this.f157711f.get(i2).f156712d - this.f157711f.get(i2).f156711c), this.f157711f.get(i2).mo110571a(true));
            } else {
                a = m124524a((int) this.f157711f.get(i2).f156710b, this.f157711f.get(i2).mo110571a(true));
            }
            i += a;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo111241a(int i) {
        this.f157716k = i;
        this.f157710e.mo110499a(i);
    }

    /* renamed from: b */
    public final void mo111248b(boolean z) {
        AbstractC70092g gVar = this.f157710e;
        if (gVar instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) gVar).f156606a = z;
        }
    }

    /* renamed from: c */
    public final void mo111249c(boolean z) {
        if (this.f157722q ^ z) {
            this.f157722q = z;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C70521a) {
            C24117a.m45712c(((C70521a) viewHolder).f157724b);
        }
    }

    /* renamed from: b */
    private void m124528b(HashMap<String, Float> hashMap) {
        for (String str : hashMap.keySet()) {
            this.f157708c.put(str, Float.valueOf(hashMap.get(str).floatValue() * ((float) this.f157715j)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b$a */
    public class C70521a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f157723a = ((ImageView) this.itemView.findViewById(R.id.c0f));

        /* renamed from: b */
        C24117a<AbstractC24453b> f157724b;

        static {
            Covode.recordClassIndex(82977);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo111251a(Bitmap bitmap) {
            MethodCollector.m26663i(11916);
            RecyclerView.C1367j jVar = (RecyclerView.C1367j) this.f157723a.getLayoutParams();
            int i = C70520b.this.f157717l % C70520b.this.f157718m.f167075b;
            int width = (bitmap.getWidth() * i) / C70520b.this.f157718m.f167075b;
            if (i == 0 || width <= 0 || width >= bitmap.getWidth()) {
                MethodCollector.m26664o(11916);
                return;
            }
            jVar.width = i;
            this.f157723a.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, bitmap.getHeight()));
            MethodCollector.m26664o(11916);
        }

        C70521a(ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_r, viewGroup, false));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo111250a(String str, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < C70520b.this.f157712g.size() && !str.equals(C70520b.this.f157712g.get(i2).mo110571a(true))) {
                i3 = (int) (((long) i3) + C70520b.this.f157712g.get(i2).f156710b);
                i2++;
            }
            return i3 + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo111252a(C24117a<AbstractC24453b> aVar, boolean z) {
            Bitmap d = aVar.mo39695a().mo40296d();
            if (d != null && !d.isRecycled() && this.f157723a != null) {
                C24117a.m45712c(this.f157724b);
                this.f157724b = aVar;
                this.f157723a.setImageBitmap(d);
                if (z) {
                    mo111251a(d);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111243a(HashMap<String, Float> hashMap) {
        m124528b(hashMap);
        AbstractC70092g gVar = this.f157710e;
        if (gVar != null) {
            gVar.mo110503b();
        }
        m124529c();
        m124527b();
    }

    /* renamed from: a */
    public final void mo111245a(List<VideoSegment> list) {
        this.f157711f = new ArrayList(list);
        m124529c();
        m124527b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111242a(VideoSegment videoSegment, HashMap<String, Float> hashMap) {
        if (!C84892d.m145850a(this.f157711f)) {
            this.f157711f.remove(videoSegment);
            mo111243a(hashMap);
        }
    }

    public C70520b(Context context, C70525f fVar) {
        this.f157715j = fVar.f157735a[0];
        this.f157716k = fVar.f157735a[1];
        this.f157717l = fVar.f157735a[2];
        m124526a(context, fVar.f157736b, fVar.f157737c, fVar.f157738d);
        if (fVar.f157739e != null) {
            this.f157718m = fVar.f157739e;
            this.f157710e = new C74266a(fVar.f157739e);
            return;
        }
        this.f157710e = new VEMediaParserFrameProviderImpl(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 <= 0.0f) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m124524a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f157708c
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x0050
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f157708c
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
        L_0x0019:
            com.ss.android.ugc.tools.utils.j r2 = com.p2082ss.android.ugc.tools.C84401c.f188722f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "duration: "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = " oneFrameDurMap"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f157708c
            java.lang.Object r0 = r0.get(r6)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = " path: "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.mo123661c(r0)
        L_0x0047:
            float r0 = (float) r5
            float r0 = r0 / r3
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            return r0
        L_0x0050:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70520b.m124524a(int, java.lang.String):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111244a(HashMap<String, Float> hashMap, VideoSegment videoSegment) {
        this.f157711f.clear();
        this.f157711f.add(videoSegment);
        mo111243a(hashMap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float min;
        float f;
        float floatValue;
        int i2 = i;
        if (viewHolder instanceof C70521a) {
            if (this.f157722q) {
                int itemCount = getItemCount();
                int i3 = (itemCount - i2) - 1;
                if (i3 >= 0 && i3 < itemCount) {
                    i2 = i3;
                }
            }
            if (this.f157718m != null) {
                C70521a aVar = (C70521a) viewHolder;
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) aVar.f157723a.getLayoutParams();
                jVar.height = C70520b.this.f157716k;
                jVar.width = C70520b.this.f157718m.f167075b;
                aVar.f157723a.setLayoutParams(jVar);
                aVar.f157723a.setImageBitmap(null);
                aVar.f157723a.setBackgroundColor(C70520b.this.f157707b.getResources().getColor(R.color.e3));
                if (C70520b.this.f157720o) {
                    aVar.f157723a.setImageBitmap(C70520b.this.f157719n.get(i2));
                    if (i2 == C70520b.this.getItemCount() - 1) {
                        aVar.mo111251a(C70520b.this.f157719n.get(i2));
                    }
                } else if (C70520b.this.f157710e != null) {
                    C70520b.this.f157710e.mo110500a(i2, "", 0, new C70523d(aVar, i2));
                }
            } else {
                C70521a aVar2 = (C70521a) viewHolder;
                C70520b.this.m124529c();
                C70520b bVar = C70520b.this;
                for (int i4 = 0; i4 < bVar.f157709d.size(); i4++) {
                    S s = bVar.f157709d.get(i4).f2751b;
                    if (i2 >= s.f2750a.intValue() && i2 <= s.f2751b.intValue()) {
                        if (i4 >= 0) {
                            S s2 = C70520b.this.f157709d.get(i4).f2751b;
                            if (C70520b.this.f157706a == 1) {
                                min = Math.min((((float) (i2 - s2.f2750a.intValue())) * C70520b.this.f157708c.get(C70520b.this.f157711f.get(i4).mo110571a(true)).floatValue()) + ((float) C70520b.this.f157711f.get(i4).mo110578d()), (float) C70520b.this.f157711f.get(i4).mo110580e());
                            } else {
                                min = Math.min(((float) (i2 - s2.f2750a.intValue())) * C70520b.this.f157708c.get(C70520b.this.f157711f.get(i4).mo110571a(true)).floatValue(), (float) C70520b.this.f157711f.get(i4).f156710b);
                            }
                            int i5 = (int) min;
                            String str = i4 + "-" + i5;
                            aVar2.f157723a.setTag(str);
                            RecyclerView.C1367j jVar2 = (RecyclerView.C1367j) aVar2.f157723a.getLayoutParams();
                            jVar2.height = C70520b.this.f157716k;
                            jVar2.width = C70520b.this.f157715j;
                            if (i2 == s2.f2751b.intValue()) {
                                if (C70520b.this.f157706a == 1) {
                                    f = (float) (C70520b.this.f157711f.get(i4).mo110580e() - C70520b.this.f157711f.get(i4).mo110578d());
                                    floatValue = C70520b.this.f157708c.get(C70520b.this.f157711f.get(i4).mo110571a(true)).floatValue();
                                } else {
                                    f = (float) C70520b.this.f157711f.get(i4).f156710b;
                                    floatValue = C70520b.this.f157708c.get(C70520b.this.f157711f.get(i4).mo110571a(true)).floatValue();
                                }
                                double floatValue2 = (double) ((f % floatValue) / C70520b.this.f157708c.get(C70520b.this.f157711f.get(i4).mo110571a(true)).floatValue());
                                double d = (double) C70520b.this.f157715j;
                                Double.isNaN(floatValue2);
                                Double.isNaN(d);
                                jVar2.width = (int) (floatValue2 * d);
                            }
                            aVar2.f157723a.setLayoutParams(jVar2);
                            aVar2.f157723a.setImageBitmap(null);
                            aVar2.f157723a.setBackgroundColor(C70520b.this.f157707b.getResources().getColor(R.color.e3));
                            if (C70520b.this.f157720o) {
                                aVar2.f157723a.setImageBitmap(C70520b.this.f157719n.get(i2));
                                return;
                            } else if (C70520b.this.f157710e != null) {
                                String a = C70520b.this.f157711f.get(i4).mo110571a(false);
                                AbstractC70092g gVar = C70520b.this.f157710e;
                                aVar2.mo111250a(C70520b.this.f157711f.get(i4).mo110571a(true), i5);
                                gVar.mo110500a(i2, a, i5, new C70524e(aVar2, aVar2, str, i2, s2, a));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111246a(List<VideoSegment> list, HashMap<String, Float> hashMap) {
        this.f157711f.clear();
        this.f157711f.addAll(list);
        mo111243a(hashMap);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m124525a(C70520b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10646);
        C70521a aVar = new C70521a(viewGroup);
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
        MethodCollector.m26664o(10646);
        return aVar;
    }

    /* renamed from: a */
    private void m124526a(Context context, List<VideoSegment> list, HashMap<String, Float> hashMap, int i) {
        this.f157707b = context;
        this.f157706a = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            VideoSegment videoSegment = list.get(i2);
            this.f157708c.put(videoSegment.mo110571a(true), Float.valueOf(hashMap.get(videoSegment.mo110571a(true)).floatValue() * ((float) this.f157715j)));
        }
        this.f157712g = list;
    }
}
