package com.p2082ss.android.ugc.aweme.tools.draft;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43237k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78247b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78402a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a */
public final class C78121a extends AbstractC78375g<C43223c> implements AwemeDraftViewHolder.AbstractC78113a {

    /* renamed from: a */
    private boolean f175444a;

    /* renamed from: b */
    private boolean f175445b;

    /* renamed from: c */
    private boolean f175446c = true;

    /* renamed from: d */
    private AbstractC78209bd f175447d;

    /* renamed from: e */
    private Map<ImageView, C24117a<AbstractC24454c>> f175448e;

    /* renamed from: r */
    private AwemeDraftViewHolder.AbstractC78113a f175449r;

    static {
        Covode.recordClassIndex(91236);
    }

    /* renamed from: f */
    private boolean m136584f() {
        for (C43223c cVar : this.f189754f) {
            if (cVar != null && cVar.mo73652a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: b */
    public final void mo122053b() {
        ArrayList<C43223c> arrayList = new ArrayList(this.f189754f);
        C1731i.m5640b(new CallableC78213c(this, arrayList), C1731i.f5562a);
        for (C43223c cVar : arrayList) {
            if (cVar.f100925y) {
                m136583d(cVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122049a(AbstractC78209bd bdVar) {
        this.f175447d = bdVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: b */
    public final void mo122055b(boolean z) {
        this.f175446c = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122052a(boolean z) {
        this.f175444a = z;
        notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final int mo122048a(int i) {
        return ((C43223c) this.f189754f.get(i)).f100924x;
    }

    /* renamed from: b */
    private int m136581b(int i) {
        int i2 = i - 1;
        while (i2 >= 0) {
            C43223c cVar = (C43223c) this.f189754f.get(i2);
            if (cVar != null && cVar.f100924x == 3) {
                break;
            }
            i2--;
        }
        return i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122051a(List<C43223c> list) {
        if (!(list == null || list.size() == 0)) {
            C43223c cVar = new C43223c();
            cVar.f100924x = 2;
            cVar.f100900W.f100772aE = false;
            list.add(0, cVar);
            this.f175445b = true;
        }
        mo122352b(list);
    }

    /* renamed from: a */
    static void m136579a(C43223c cVar) {
        C63253l.f143623a.mo73319o().mo93758a(cVar.mo73726r());
        C78133ai.m136600a().mo122073b(cVar, "user_click");
        C43225d.m86337g(cVar);
        C72867e.m128688b(cVar.mo73676f());
        C80285bz.m139188b(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo122056c(C43223c cVar) {
        String str;
        m136579a(cVar);
        m136583d(cVar);
        C78397c.m136927a().notifyDraftDelete(cVar);
        C84425b a = new C84425b().mo129406a("enter_method", "single_delete").mo129403a("draft_cnt", 1);
        if (this.f175446c) {
            str = "storage_management";
        } else {
            str = "personal_homepage";
        }
        C39162r.m79460a("delete_drafts", a.mo129406a("enter_from", str).f188764a);
        return null;
    }

    /* renamed from: c */
    private boolean m136582c(int i) {
        if (((C43223c) this.f189754f.get(i)).f100906f == null || i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (((C43223c) this.f189754f.get(i2)).f100924x != 1 && ((C43223c) this.f189754f.get(i2)).f100924x != 5) {
            return false;
        }
        if (i == this.f189754f.size() - 1) {
            return true;
        }
        int i3 = i + 1;
        if (((C43223c) this.f189754f.get(i3)).f100924x == 1 || ((C43223c) this.f189754f.get(i3)).f100924x == 5 || ((C43223c) this.f189754f.get(i3)).f100906f == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m136583d(C43223c cVar) {
        AbstractC78209bd bdVar;
        AbstractC78209bd bdVar2;
        int indexOf = this.f189754f.indexOf(cVar);
        if (indexOf != -1) {
            int b = m136581b(indexOf);
            boolean a = m136580a(b, indexOf);
            if (m136582c(indexOf)) {
                this.f189754f.remove(indexOf);
                int i = indexOf - 1;
                this.f189754f.remove(i);
                if (a) {
                    this.f189754f.remove(b);
                }
                if (m136584f() || (bdVar2 = this.f175447d) == null) {
                    notifyItemRangeRemoved(i, 2);
                    if (a) {
                        notifyItemRemoved(b);
                        return;
                    }
                    return;
                }
                bdVar2.mo122062a();
                return;
            }
            this.f189754f.remove(indexOf);
            if (a) {
                this.f189754f.remove(b);
            }
            if (m136584f() || (bdVar = this.f175447d) == null) {
                notifyItemRemoved(indexOf);
                if (a) {
                    notifyItemRemoved(b);
                    return;
                }
                return;
            }
            bdVar.mo122062a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: b */
    public final void mo122054b(C43223c cVar) {
        if (!(getItemCount() == 0 || cVar == null)) {
            int size = this.f189754f.size();
            for (int i = 0; i < size; i++) {
                C43223c cVar2 = (C43223c) this.f189754f.get(i);
                if (cVar2 != null && C13627m.m24499a(cVar.mo73726r(), cVar2.mo73726r())) {
                    this.f189754f.set(i, cVar);
                    notifyItemChanged(i);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122050a(String str) {
        if (this.f189754f != null) {
            for (C43223c cVar : this.f189754f) {
                if (TextUtils.equals(str, cVar.mo73726r())) {
                    m136583d(cVar);
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$a */
    protected class C78122a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91237);
        }

        C78122a(View view) {
            super(view);
        }
    }

    public C78121a(Map<ImageView, C24117a<AbstractC24454c>> map, AwemeDraftViewHolder.AbstractC78113a aVar) {
        this.f175448e = map;
        this.f175449r = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$b */
    protected class C78123b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f175451a;

        static {
            Covode.recordClassIndex(91238);
        }

        C78123b(View view) {
            super(view);
            this.f175451a = (TextView) view.findViewById(R.id.f62);
            C17301b.m32033a().mo27614a(this.f175451a, C17303d.f41573g);
        }
    }

    /* renamed from: a */
    private boolean m136580a(int i, int i2) {
        if (-1 == i) {
            return false;
        }
        for (int i3 = i + 1; i3 < this.f189754f.size(); i3++) {
            C43223c cVar = (C43223c) this.f189754f.get(i3);
            if (cVar != null) {
                if (!cVar.mo73652a() || i3 == i2) {
                    if (3 == cVar.f100924x) {
                        break;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C78386i(false, C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9x, viewGroup, false));
        }
        if (i == 5) {
            return new C78386i(true, C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9x, viewGroup, false));
        }
        if (i == 2) {
            return new C78122a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9v, viewGroup, false));
        }
        if (3 == i) {
            return new C78123b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_0, viewGroup, false));
        }
        return new AwemeDraftViewHolder(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9s, viewGroup, false), this.f175448e, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.AbstractC78113a
    /* renamed from: a */
    public final void mo122028a(int i, C43223c cVar) {
        Iterator it = this.f189754f.iterator();
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C43223c cVar2 = (C43223c) it.next();
            if (cVar2.f100924x == 0) {
                i3++;
                if (cVar2 == cVar) {
                    i2 = i3;
                    break;
                }
            }
        }
        cVar.f100912l = i2;
        this.f175449r.mo122028a(i, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.AbstractC78113a
    /* renamed from: a */
    public final void mo122029a(View view, C43223c cVar) {
        C78402a aVar = new C78402a(view.getContext());
        aVar.mo122330a(new String[]{view.getContext().getResources().getString(R.string.y8)}, new DialogInterface$OnClickListenerC78229d(this, view, cVar));
        aVar.f176147a.mo458b();
        this.f175449r.mo122029a(view, cVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final void mo112428a(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        MethodCollector.m26663i(7385);
        C1731i.m5640b(new CallableC78186b(this, i), C1731i.f5562a);
        if (viewHolder instanceof AwemeDraftViewHolder) {
            int i2 = i - 1;
            if (i2 <= 0 || !((C43223c) this.f189754f.get(i2)).f100926z || ((C43223c) this.f189754f.get(i)).f100924x != 0) {
                z = false;
            } else {
                z = true;
            }
            AwemeDraftViewHolder awemeDraftViewHolder = (AwemeDraftViewHolder) viewHolder;
            awemeDraftViewHolder.f175416s = z;
            awemeDraftViewHolder.f175410m = this.f175444a;
            awemeDraftViewHolder.f175411n = this.f175446c;
            C43223c cVar = (C43223c) this.f189754f.get(i);
            if (cVar == null || cVar.f100902b == null) {
                MethodCollector.m26664o(7385);
                return;
            }
            awemeDraftViewHolder.f175453t = cVar;
            if (awemeDraftViewHolder.f175410m) {
                awemeDraftViewHolder.f175407j.mo122032a();
                awemeDraftViewHolder.f175405h.animate().alpha(0.0f).setDuration(200).start();
            } else {
                awemeDraftViewHolder.f175407j.mo122033b();
                awemeDraftViewHolder.f175405h.animate().alpha(1.0f).setDuration(200).start();
                ((C43223c) awemeDraftViewHolder.f175453t).f100925y = false;
            }
            if (awemeDraftViewHolder.f175411n) {
                awemeDraftViewHolder.f175400c.setText(C78247b.m136734a(awemeDraftViewHolder.f175413p, cVar));
            }
            awemeDraftViewHolder.f175406i.setOnCheckedChangeListener(null);
            awemeDraftViewHolder.f175406i.setChecked(((C43223c) awemeDraftViewHolder.f175453t).f100925y);
            awemeDraftViewHolder.f175406i.setOnCheckedChangeListener(new C78470w(awemeDraftViewHolder));
            awemeDraftViewHolder.f175403f.setTag(cVar.mo73726r());
            awemeDraftViewHolder.f175403f.setActualImageResource(2131232418);
            int dimensionPixelOffset = awemeDraftViewHolder.f175413p.getResources().getDimensionPixelOffset(R.dimen.j6);
            C43237k kVar = new C43237k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
            if (cVar.f100900W == null || cVar.f100900W.f100842bo == null) {
                C43225d.m86327a((C43223c) awemeDraftViewHolder.f175453t, kVar, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02ee: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.draft.model.c : 0x02e7: CHECK_CAST (r2v12 com.ss.android.ugc.aweme.draft.model.c) = (com.ss.android.ugc.aweme.draft.model.c) (wrap: java.lang.Object : 0x02e5: IGET  (r2v11 java.lang.Object) = (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder) com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.t java.lang.Object))
                      (r4v1 'kVar' com.ss.android.ugc.aweme.draft.model.k)
                      (wrap: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2 : 0x02eb: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2) = 
                      (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder)
                      (r7v1 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                     call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR)
                     type: STATIC call: com.ss.android.ugc.aweme.draft.model.d.a(com.ss.android.ugc.aweme.draft.model.c, com.ss.android.ugc.aweme.draft.model.k, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback):void in method: com.ss.android.ugc.aweme.tools.draft.a.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02eb: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$2) = 
                      (r13v3 'awemeDraftViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder)
                      (r7v1 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                     call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.draft.a.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 902
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78121a.mo112428a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }
        }
