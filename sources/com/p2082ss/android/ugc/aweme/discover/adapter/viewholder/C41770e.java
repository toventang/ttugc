package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41602ad;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.e */
public final class C41770e extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public static final C41772a f97440d = new C41772a((byte) 0);

    /* renamed from: a */
    public final RecyclerView.AbstractC1350a<C41602ad> f97441a;

    /* renamed from: b */
    public CopyOnWriteArrayList<SearchHistory> f97442b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public ViewGroup f97443c;

    /* renamed from: e */
    private RecyclerView f97444e;

    /* renamed from: f */
    private TextView f97445f;

    static {
        Covode.recordClassIndex(49685);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.e$a */
    public static final class C41772a {
        static {
            Covode.recordClassIndex(49687);
        }

        private C41772a() {
        }

        public /* synthetic */ C41772a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41770e(View view, final AbstractC42664al.AbstractC42666b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C417711 r1 = new RecyclerView.AbstractC1350a<C41602ad>(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41770e.C417711 */

            /* renamed from: a */
            final /* synthetic */ C41770e f97446a;

            static {
                Covode.recordClassIndex(49686);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ C41602ad onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m83732a(this, viewGroup, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final int getItemCount() {
                return this.f97446a.f97442b.size();
            }

            {
                this.f97446a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ void onBindViewHolder(C41602ad adVar, int i) {
                C41602ad adVar2 = adVar;
                C89219l.m154721d(adVar2, "");
                SearchHistory searchHistory = this.f97446a.f97442b.get(i);
                if (searchHistory == null) {
                    adVar2.itemView.setVisibility(8);
                    return;
                }
                adVar2.itemView.setVisibility(0);
                adVar2.f97030b.setText(searchHistory.keyword);
                adVar2.f97030b.setSingleLine(true);
                adVar2.itemView.setOnTouchListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: INVOKE  
                      (wrap: android.view.View : 0x002e: IGET  (r1v2 android.view.View) = (r5v1 'adVar2' com.ss.android.ugc.aweme.discover.adapter.ad) com.ss.android.ugc.aweme.discover.adapter.ad.itemView android.view.View)
                      (wrap: com.ss.android.ugc.aweme.discover.adapter.ad$2 : 0x0032: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.discover.adapter.ad$2) = 
                      (r5v1 'adVar2' com.ss.android.ugc.aweme.discover.adapter.ad)
                      (r2v1 'searchHistory' com.ss.android.ugc.aweme.discover.model.SearchHistory)
                      (r6v0 'i' int)
                     call: com.ss.android.ugc.aweme.discover.adapter.ad.2.<init>(com.ss.android.ugc.aweme.discover.adapter.ad, com.ss.android.ugc.aweme.discover.model.SearchHistory, int):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.ss.android.ugc.aweme.discover.adapter.viewholder.e.1.onBindViewHolder(com.ss.android.ugc.aweme.discover.adapter.ad, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.discover.adapter.ad$2) = 
                      (r5v1 'adVar2' com.ss.android.ugc.aweme.discover.adapter.ad)
                      (r2v1 'searchHistory' com.ss.android.ugc.aweme.discover.model.SearchHistory)
                      (r6v0 'i' int)
                     call: com.ss.android.ugc.aweme.discover.adapter.ad.2.<init>(com.ss.android.ugc.aweme.discover.adapter.ad, com.ss.android.ugc.aweme.discover.model.SearchHistory, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.discover.adapter.viewholder.e.1.onBindViewHolder(com.ss.android.ugc.aweme.discover.adapter.ad, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.discover.adapter.ad, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                    this = this;
                    com.ss.android.ugc.aweme.discover.adapter.ad r5 = (com.p2082ss.android.ugc.aweme.discover.adapter.C41602ad) r5
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                    com.ss.android.ugc.aweme.discover.adapter.viewholder.e r0 = r4.f97446a
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.discover.model.SearchHistory> r0 = r0.f97442b
                    java.lang.Object r2 = r0.get(r6)
                    com.ss.android.ugc.aweme.discover.model.SearchHistory r2 = (com.p2082ss.android.ugc.aweme.discover.model.SearchHistory) r2
                    if (r2 != 0) goto L_0x001b
                    android.view.View r1 = r5.itemView
                    r0 = 8
                    r1.setVisibility(r0)
                    return
                L_0x001b:
                    android.view.View r1 = r5.itemView
                    r0 = 0
                    r1.setVisibility(r0)
                    android.widget.TextView r1 = r5.f97030b
                    java.lang.String r0 = r2.keyword
                    r1.setText(r0)
                    android.widget.TextView r0 = r5.f97030b
                    r3 = 1
                    r0.setSingleLine(r3)
                    android.view.View r1 = r5.itemView
                    com.ss.android.ugc.aweme.discover.adapter.ad$2 r0 = new com.ss.android.ugc.aweme.discover.adapter.ad$2
                    r0.<init>(r2, r6)
                    r1.setOnTouchListener(r0)
                    r5.f97031c = r2
                    android.view.View r0 = r5.itemView
                    android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                    if (r2 == 0) goto L_0x005d
                    android.view.View r0 = r5.itemView
                    android.content.Context r1 = r0.getContext()
                    r0 = 1110441984(0x42300000, float:44.0)
                    float r0 = com.bytedance.common.utility.C13628n.m24520b(r1, r0)
                    int r0 = (int) r0
                    r2.height = r0
                    android.widget.TextView r1 = r5.f97030b
                    r0 = 1097859072(0x41700000, float:15.0)
                    r1.setTextSize(r3, r0)
                    android.view.View r0 = r5.itemView
                    r0.setLayoutParams(r2)
                L_0x005d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41770e.C417711.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            /* renamed from: a */
            private static RecyclerView.ViewHolder m83732a(C417711 r6, ViewGroup viewGroup, int i) {
                boolean a;
                MethodCollector.m26663i(8935);
                C89219l.m154721d(viewGroup, "");
                C41602ad adVar = new C41602ad(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.auw, viewGroup, false), bVar);
                C89219l.m154716b(adVar, "");
                try {
                    if (adVar.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(adVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) adVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(adVar.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = adVar.getClass().getName();
                MethodCollector.m26664o(8935);
                return adVar;
            }
        };
        this.f97441a = r1;
        View findViewById = view.findViewById(R.id.c_h);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f97444e = recyclerView;
        recyclerView.setAdapter(r1);
        RecyclerView recyclerView2 = this.f97444e;
        view.getContext();
        recyclerView2.setLayoutManager(new SearchHistoryLinesViewHolder$2(view));
        View findViewById2 = view.findViewById(R.id.ff3);
        C89219l.m154716b(findViewById2, "");
        this.f97445f = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ff2);
        C89219l.m154716b(findViewById3, "");
        this.f97443c = (ViewGroup) findViewById3;
    }
}
