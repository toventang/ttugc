package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43237k;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70788aa;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78402a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.n */
public final class C78413n extends AbstractC78375g<C43223c> implements AwemeDraftNewViewHolder.AbstractC78110a {

    /* renamed from: b */
    public static final C78417c f176181b = new C78417c((byte) 0);

    /* renamed from: a */
    boolean f176182a = true;

    /* renamed from: c */
    private final String f176183c = "AwemeDraftNewAdapter";

    /* renamed from: d */
    private boolean f176184d;

    /* renamed from: e */
    private boolean f176185e;

    /* renamed from: r */
    private AbstractC78209bd f176186r;

    /* renamed from: s */
    private List<C43223c> f176187s = new ArrayList();

    /* renamed from: t */
    private final Map<ImageView, C24117a<AbstractC24454c>> f176188t;

    /* renamed from: u */
    private final AwemeDraftViewHolder.AbstractC78113a f176189u;

    static {
        Covode.recordClassIndex(91539);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$c */
    public static final class C78417c {
        static {
            Covode.recordClassIndex(91543);
        }

        private C78417c() {
        }

        public /* synthetic */ C78417c(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122051a(List<C43223c> list) {
        if (list != null) {
            if (list.size() != 0) {
                C43223c cVar = new C43223c();
                cVar.f100924x = 2;
                cVar.f100900W.f100772aE = false;
                list.add(0, cVar);
                this.f176185e = true;
                C43223c cVar2 = new C43223c();
                cVar2.f100924x = 10;
                cVar2.f100900W.f100772aE = false;
                list.add(cVar2);
            }
            mo122352b(list);
        }
    }

    /* renamed from: f */
    private final boolean m136938f() {
        for (C43223c cVar : this.f189754f) {
            if (cVar != null && cVar.mo73652a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$d */
    static final class RunnableC78418d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78413n f176193a;

        /* renamed from: b */
        final /* synthetic */ List f176194b;

        static {
            Covode.recordClassIndex(91544);
        }

        RunnableC78418d(C78413n nVar, List list) {
            this.f176193a = nVar;
            this.f176194b = list;
        }

        public final void run() {
            for (final C43223c cVar : this.f176194b) {
                if (cVar.f100925y) {
                    C78413n.m136937c(cVar);
                    C40984s.m82525a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.C78413n.RunnableC78418d.RunnableC784191 */

                        static {
                            Covode.recordClassIndex(91545);
                        }

                        public final void run() {
                            C78397c.m136927a().notifyDraftDelete(cVar);
                        }
                    });
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: b */
    public final void mo122053b() {
        ArrayList<C43223c> arrayList = new ArrayList(this.f189754f);
        C40984s.m82526b(new RunnableC78418d(this, arrayList));
        for (C43223c cVar : arrayList) {
            if (cVar.f100925y) {
                mo122351a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$f */
    static final class C78421f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78413n f176199a;

        /* renamed from: b */
        final /* synthetic */ C43223c f176200b;

        static {
            Covode.recordClassIndex(91547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78421f(C78413n nVar, C43223c cVar) {
            super(0);
            this.f176199a = nVar;
            this.f176200b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            C78413n.m136937c(this.f176200b);
            this.f176199a.mo122351a(this.f176200b);
            C78397c.m136927a().notifyDraftDelete(this.f176200b);
            C84425b a = new C84425b().mo129406a("enter_method", "single_delete").mo129403a("draft_cnt", 1);
            if (this.f176199a.f176182a) {
                str = "storage_management";
            } else {
                str = "personal_homepage";
            }
            C39162r.m79460a("delete_drafts", a.mo129406a("enter_from", str).f188764a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122049a(AbstractC78209bd bdVar) {
        this.f176186r = bdVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: b */
    public final void mo122055b(boolean z) {
        this.f176182a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122052a(boolean z) {
        this.f176184d = z;
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$e */
    static final class C78420e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176196a;

        /* renamed from: b */
        final /* synthetic */ C78413n f176197b;

        /* renamed from: c */
        final /* synthetic */ int f176198c;

        static {
            Covode.recordClassIndex(91546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78420e(C78413n nVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176197b = nVar;
            this.f176198c = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78420e(this.f176197b, this.f176198c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78420e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f176196a == 0) {
                C89382r.m154942a(obj);
                int i = this.f176198c;
                List list = this.f176197b.f189754f;
                C89219l.m154716b(list, "");
                C78176aw.m136661a(i, list);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: c */
    public static void m136937c(C43223c cVar) {
        AbstractC63171ae o = C63253l.f143623a.mo73319o();
        String r = cVar.mo73726r();
        C89219l.m154716b(r, "");
        o.mo93758a(r);
        C78133ai.m136600a().mo122073b(cVar, "user_click");
        C43225d.m86337g(cVar);
        C72867e.m128688b(cVar.mo73676f());
        C80285bz.m139188b(cVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final int mo122048a(int i) {
        if (this.f189754f != null && this.f189754f.size() > i) {
            Object obj = this.f189754f.get(i);
            C89219l.m154716b(obj, "");
            return ((C43223c) obj).f100924x;
        } else if (this.f189754f == null || this.f189754f.size() <= 0) {
            return 0;
        } else {
            Object obj2 = this.f189754f.get(0);
            C89219l.m154716b(obj2, "");
            return ((C43223c) obj2).f100924x;
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

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84923a
    /* renamed from: b */
    public final void mo122352b(List<C43223c> list) {
        C89219l.m154721d(list, "");
        if (this.f189754f == null) {
            this.f189754f = new ArrayList();
        }
        List list2 = this.f189754f;
        C89219l.m154716b(list2, "");
        C1445j.C1450d a = C1445j.m4921a(new C78378h(list2, list));
        C89219l.m154716b(a, "");
        a.mo4951a(this);
        this.f189754f = new ArrayList(list);
    }

    /* renamed from: a */
    public final void mo122351a(C43223c cVar) {
        AbstractC78209bd bdVar;
        int indexOf = this.f189754f.indexOf(cVar);
        if (indexOf != -1) {
            this.f189754f.remove(indexOf);
            if (m136938f() || (bdVar = this.f176186r) == null) {
                notifyItemRemoved(indexOf);
            } else {
                bdVar.mo122062a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78375g
    /* renamed from: a */
    public final void mo122050a(String str) {
        if (this.f189754f != null) {
            for (C43223c cVar : this.f189754f) {
                C89219l.m154716b(cVar, "");
                if (TextUtils.equals(str, cVar.mo73726r())) {
                    mo122351a(cVar);
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$a */
    final class C78415a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78415a(View view) {
            super(view);
            if (view == null) {
                C89219l.m154715b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$b */
    final class C78416b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(91542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78416b(View view) {
            super(view);
            if (view == null) {
                C89219l.m154715b();
            }
        }
    }

    public C78413n(Map<ImageView, C24117a<AbstractC24454c>> map, AwemeDraftViewHolder.AbstractC78113a aVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        this.f176188t = map;
        this.f176189u = aVar;
        this.f189770p = new GridLayoutManager.AbstractC1337c(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.C78413n.C784141 */

            /* renamed from: e */
            final /* synthetic */ C78413n f176190e;

            static {
                Covode.recordClassIndex(91540);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f176190e = r1;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                int itemViewType = this.f176190e.getItemViewType(i);
                if (itemViewType == 2 || itemViewType == 10) {
                    return 3;
                }
                return 1;
            }
        };
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.n$g */
    static final class DialogInterface$OnClickListenerC78422g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78413n f176201a;

        /* renamed from: b */
        final /* synthetic */ View f176202b;

        /* renamed from: c */
        final /* synthetic */ C43223c f176203c;

        static {
            Covode.recordClassIndex(91548);
        }

        DialogInterface$OnClickListenerC78422g(C78413n nVar, View view, C43223c cVar) {
            this.f176201a = nVar;
            this.f176202b = view;
            this.f176203c = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            C78413n nVar = this.f176201a;
            Context context = this.f176202b.getContext();
            C89219l.m154716b(context, "");
            C43223c cVar = this.f176203c;
            String quantityString = context.getResources().getQuantityString(R.plurals.b4, 1);
            C89219l.m154716b(quantityString, "");
            String string = context.getString(R.string.bc2);
            C89219l.m154716b(string, "");
            C78421f fVar = new C78421f(nVar, cVar);
            String string2 = context.getString(R.string.bc3);
            C89219l.m154716b(string2, "");
            C70788aa.m125072a(context, quantityString, string, fVar, string2);
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i == 2) {
            return new C78415a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9v, viewGroup, false));
        }
        if (i == 10) {
            return new C78416b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9t, viewGroup, false));
        }
        return new AwemeDraftNewViewHolder(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9z, viewGroup, false), this.f176188t, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.AbstractC78110a
    /* renamed from: a */
    public final void mo122025a(int i, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        Iterator it = this.f189754f.iterator();
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C43223c cVar2 = (C43223c) it.next();
            C89219l.m154716b(cVar2, "");
            if (cVar2.f100924x == 0) {
                i3++;
                if (cVar2 == cVar) {
                    i2 = i3;
                    break;
                }
            }
        }
        cVar.f100912l = i2;
        this.f176189u.mo122028a(i, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.AbstractC78110a
    /* renamed from: a */
    public final void mo122026a(View view, C43223c cVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(cVar, "");
        C78402a aVar = new C78402a(view.getContext());
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        aVar.mo122330a(new String[]{context.getResources().getString(R.string.y8)}, new DialogInterface$OnClickListenerC78422g(this, view, cVar));
        aVar.f176147a.mo458b();
        this.f176189u.mo122029a(view, cVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final void mo112428a(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        C89219l.m154721d(viewHolder, "");
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C78420e(this, i, null), 3);
        if (viewHolder instanceof AwemeDraftNewViewHolder) {
            AwemeDraftNewViewHolder awemeDraftNewViewHolder = (AwemeDraftNewViewHolder) viewHolder;
            awemeDraftNewViewHolder.f175379c = this.f176184d;
            awemeDraftNewViewHolder.f175380d = this.f176182a;
            C43223c cVar = (C43223c) this.f189754f.get(i);
            if (cVar != null && cVar.f100902b != null) {
                awemeDraftNewViewHolder.f175453t = cVar;
                if (awemeDraftNewViewHolder.f175379c) {
                    awemeDraftNewViewHolder.f175378b.setVisibility(0);
                } else {
                    awemeDraftNewViewHolder.f175378b.setVisibility(8);
                    ((C43223c) awemeDraftNewViewHolder.f175453t).f100925y = false;
                }
                awemeDraftNewViewHolder.f175378b.setOnCheckedChangeListener(null);
                awemeDraftNewViewHolder.f175378b.setChecked(((C43223c) awemeDraftNewViewHolder.f175453t).f100925y);
                awemeDraftNewViewHolder.f175378b.setOnCheckedChangeListener(new C78425q(awemeDraftNewViewHolder));
                awemeDraftNewViewHolder.f175454u.setTag(cVar.mo73726r());
                awemeDraftNewViewHolder.f175454u.setActualImageResource(2131232418);
                C43237k kVar = new C43237k(awemeDraftNewViewHolder.f175389m, (awemeDraftNewViewHolder.f175389m * 4) / 3, Bitmap.Config.ARGB_8888);
                if (cVar.f100900W == null || cVar.f100900W.f100842bo == null) {
                    C43225d.m86327a((C43223c) awemeDraftNewViewHolder.f175453t, kVar, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0139: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.draft.model.c : 0x0132: CHECK_CAST (r1v8 com.ss.android.ugc.aweme.draft.model.c) = (com.ss.android.ugc.aweme.draft.model.c) (wrap: java.lang.Object : 0x0130: IGET  (r1v7 java.lang.Object) = (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder) com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.t java.lang.Object))
                          (r6v0 'kVar' com.ss.android.ugc.aweme.draft.model.k)
                          (wrap: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2 : 0x0136: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2) = 
                          (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder)
                          (r2v2 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                         call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR)
                         type: STATIC call: com.ss.android.ugc.aweme.draft.model.d.a(com.ss.android.ugc.aweme.draft.model.c, com.ss.android.ugc.aweme.draft.model.k, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback):void in method: com.ss.android.ugc.aweme.tools.draft.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes7.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0136: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$2) = 
                          (r9v1 'awemeDraftNewViewHolder' com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder)
                          (r2v2 'cVar' com.ss.android.ugc.aweme.draft.model.c)
                         call: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder.2.<init>(com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, com.ss.android.ugc.aweme.draft.model.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.draft.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 354
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78413n.mo112428a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }
            }
