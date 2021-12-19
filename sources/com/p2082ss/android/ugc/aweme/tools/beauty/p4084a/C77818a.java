package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77828d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77831e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77835g;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77841h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77849l;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78088b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4336a.C84380c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a */
public final class C77818a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final ArrayList<ComposerBeauty> f174570a = new ArrayList<>();

    /* renamed from: b */
    public AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> f174571b;

    /* renamed from: c */
    public AbstractC89187q<? super String, ? super Boolean, ? super String, C89391z> f174572c;

    /* renamed from: d */
    public AbstractC89172b<? super String, Boolean> f174573d;

    /* renamed from: e */
    public boolean f174574e = true;

    /* renamed from: f */
    public boolean f174575f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f174576g;

    /* renamed from: h */
    public AbstractC89183m<? super String, ? super Boolean, C89391z> f174577h;

    /* renamed from: i */
    public boolean f174578i;

    /* renamed from: j */
    public AbstractC89172b<? super String, String> f174579j;

    /* renamed from: k */
    public final C77859d f174580k;

    /* renamed from: l */
    public final RecyclerView f174581l;

    /* renamed from: m */
    private final List<C77825b> f174582m = new ArrayList();

    /* renamed from: n */
    private final AbstractC89183m<ComposerBeauty, Integer, C89391z> f174583n = new C77822d(this);

    /* renamed from: o */
    private final AbstractC89183m<ComposerBeauty, Integer, C89391z> f174584o = new C77819a(this);

    /* renamed from: p */
    private final AbstractC89183m<String, Boolean, C89391z> f174585p = new C77823e(this);

    /* renamed from: q */
    private final AbstractC89172b<Boolean, C89391z> f174586q = new C77821c(this);

    /* renamed from: r */
    private final AbstractC89183m<String, Boolean, C89391z> f174587r = new C77820b(this);

    static {
        Covode.recordClassIndex(90905);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m135935a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f174582m.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f174582m.get(i).f174595a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$c */
    public static final class C77821c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f174590a;

        static {
            Covode.recordClassIndex(90908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77821c(C77818a aVar) {
            super(1);
            this.f174590a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                AbstractC89171a<C89391z> aVar = this.f174590a.f174576g;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f174590a.mo121446b(true);
                this.f174590a.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo121446b(boolean z) {
        for (T t : this.f174582m) {
            if (t instanceof C77848k) {
                t.f174652c = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo121443a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        int i = 0;
        for (C77825b bVar : this.f174582m) {
            if (!(bVar instanceof C77827c) || !C89219l.m154714a(((C77827c) bVar).f174596c, composerBeauty)) {
                i++;
            } else if (i >= 0 && i < this.f174582m.size()) {
                notifyItemChanged(i);
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo121444a(boolean z) {
        this.f174574e = z;
        if (this.f174580k.f174685q) {
            for (T t : this.f174582m) {
                if (t instanceof C77834f) {
                    t.f174616d = z;
                } else if (t instanceof C77827c) {
                    t.f174597d = z;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$a */
    public static final class C77819a extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f174588a;

        static {
            Covode.recordClassIndex(90906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77819a(C77818a aVar) {
            super(2);
            this.f174588a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            int intValue = num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> mVar = this.f174588a.f174571b;
            if (mVar != null) {
                mVar.invoke(composerBeauty2, Integer.valueOf(intValue));
            }
            this.f174588a.mo121445a(false, composerBeauty2.getCategoryExtra().getCategoryId());
            this.f174588a.notifyDataSetChanged();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$b */
    public static final class C77820b extends AbstractC89220m implements AbstractC89183m<String, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f174589a;

        static {
            Covode.recordClassIndex(90907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77820b(C77818a aVar) {
            super(2);
            this.f174589a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Boolean bool) {
            String str2 = str;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(str2, "");
            AbstractC89183m<? super String, ? super Boolean, C89391z> mVar = this.f174589a.f174577h;
            if (mVar != null) {
                mVar.invoke(str2, Boolean.valueOf(booleanValue));
            }
            this.f174589a.mo121445a(true, str2);
            this.f174589a.notifyDataSetChanged();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$e */
    public static final class C77823e extends AbstractC89220m implements AbstractC89183m<String, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f174592a;

        static {
            Covode.recordClassIndex(90910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77823e(C77818a aVar) {
            super(2);
            this.f174592a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(str, "");
            AbstractC89187q<? super String, ? super Boolean, ? super String, C89391z> qVar = this.f174592a.f174572c;
            if (qVar != null) {
                qVar.invoke(str, Boolean.valueOf(booleanValue), "user");
            }
            this.f174592a.mo121444a(booleanValue);
            C80558hx.m139642a(0, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77818a.C77823e.C778241 */

                /* renamed from: a */
                final /* synthetic */ C77823e f174593a;

                static {
                    Covode.recordClassIndex(90911);
                }

                {
                    this.f174593a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    RecyclerView.AbstractC1362i layoutManager = this.f174593a.f174592a.f174581l.getLayoutManager();
                    if (layoutManager != null && !layoutManager.mo4728q() && !this.f174593a.f174592a.f174581l.mo4484l()) {
                        this.f174593a.f174592a.notifyDataSetChanged();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$d */
    public static final class C77822d extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f174591a;

        static {
            Covode.recordClassIndex(90909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77822d(C77818a aVar) {
            super(2);
            this.f174591a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            int intValue = num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> mVar = this.f174591a.f174571b;
            if (mVar != null) {
                mVar.invoke(composerBeauty2, Integer.valueOf(intValue));
            }
            if (!this.f174591a.f174574e) {
                AbstractC89187q<? super String, ? super Boolean, ? super String, C89391z> qVar = this.f174591a.f174572c;
                if (qVar != null) {
                    qVar.invoke(composerBeauty2.getCategoryId(), true, "auto");
                }
                this.f174591a.mo121444a(true);
            }
            this.f174591a.notifyDataSetChanged();
            return C89391z.f203057a;
        }
    }

    public C77818a(C77859d dVar, RecyclerView recyclerView) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(recyclerView, "");
        this.f174580k = dVar;
        this.f174581l = recyclerView;
    }

    /* renamed from: a */
    public static /* synthetic */ void m135936a(C77818a aVar, List list) {
        ComposerBeauty composerBeauty;
        String invoke;
        ComposerBeauty composerBeauty2;
        Boolean invoke2;
        String str = "";
        C89219l.m154721d(list, str);
        aVar.f174570a.clear();
        aVar.f174570a.addAll(list);
        aVar.f174582m.clear();
        boolean z = true;
        aVar.f174574e = true;
        if (aVar.f174580k.f174685q && (composerBeauty2 = (ComposerBeauty) C89070n.m154583g(list)) != null && !C77878d.m135999b(composerBeauty2) && composerBeauty2.getCategoryExtra() != null && composerBeauty2.getCategoryExtra().getShowSwitch()) {
            AbstractC89172b<? super String, Boolean> bVar = aVar.f174573d;
            if (!(bVar == null || (invoke2 = bVar.invoke(composerBeauty2.getCategoryId())) == null)) {
                z = invoke2.booleanValue();
            }
            aVar.f174574e = z;
            aVar.f174582m.add(0, new C77834f(composerBeauty2.getCategoryId(), aVar.f174574e));
        }
        if (aVar.f174580k.f174686r && (composerBeauty = (ComposerBeauty) C89070n.m154583g(list)) != null && composerBeauty.getCategoryExtra() != null && composerBeauty.isBeautyMode()) {
            List<C77825b> list2 = aVar.f174582m;
            AbstractC89172b<? super String, String> bVar2 = aVar.f174579j;
            if (!(bVar2 == null || (invoke = bVar2.invoke(composerBeauty.getCategoryId())) == null)) {
                str = invoke;
            }
            list2.add(0, new C77847j(str));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComposerBeauty composerBeauty3 = (ComposerBeauty) it.next();
            if (composerBeauty3.isBeautyMode()) {
                aVar.f174582m.add(new C77846i(composerBeauty3));
            } else {
                aVar.f174582m.add(new C77827c(composerBeauty3, aVar.f174574e));
            }
        }
        aVar.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo121445a(boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f174578i = z;
        for (T t : this.f174582m) {
            if (t instanceof C77847j) {
                T t2 = t;
                t2.f174651d = z;
                if (str.length() > 0) {
                    C89219l.m154721d(str, "");
                    t2.f174650c = str;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String b;
        C89219l.m154721d(viewHolder, "");
        boolean z8 = false;
        this.f174575f = false;
        C77834f fVar = null;
        if (viewHolder instanceof C77835g) {
            C77825b bVar = this.f174582m.get(i);
            if (bVar instanceof C77834f) {
                fVar = bVar;
            }
            C77834f fVar2 = fVar;
            if (fVar2 != null) {
                C77835g gVar = (C77835g) viewHolder;
                C89219l.m154721d(fVar2, "");
                gVar.f174622e = fVar2;
                gVar.f174618a.setCheckedNoEvent(fVar2.f174616d);
                TextView textView = gVar.f174619b;
                C89219l.m154716b(textView, "");
                if (fVar2.f174616d) {
                    b = gVar.mo121449a();
                } else {
                    b = gVar.mo121450b();
                }
                textView.setText(b);
                gVar.f174618a.setOnCheckedChangeListener(new C77835g.C77837b(gVar));
                C84380c.m145132a(gVar.f174618a);
                C0792v.m2747a(gVar.f174620c, new C77835g.C77838c(gVar));
            }
        } else if (viewHolder instanceof C77828d) {
            C77825b bVar2 = this.f174582m.get(i);
            if (bVar2 instanceof C77846i) {
                fVar = bVar2;
            }
            C77846i iVar = fVar;
            if (iVar != null) {
                C77828d dVar = (C77828d) viewHolder;
                if (i == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f174582m.size() <= 1 || i != this.f174582m.size() - 1) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                C89219l.m154721d(iVar, "");
                ComposerBeauty composerBeauty = iVar.f174649c;
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(composerBeauty.getCategoryExtra().getPrimaryPanelIcon());
                urlModel.setUrlList(composerBeauty.getCategoryExtra().getPrimaryPanelIconList());
                dVar.f174599a.setCustomSelected(composerBeauty.getSelected());
                if (!composerBeauty.isLocalItem() || composerBeauty.getLocalIconResId() <= 0) {
                    C84402a.m145168a(dVar.f174599a.getImageView(), urlModel);
                } else {
                    dVar.f174599a.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    dVar.f174599a.getImageView().setImageResource(composerBeauty.getLocalIconResId());
                }
                if (composerBeauty.isBeautyMode()) {
                    dVar.f174599a.setText(composerBeauty.getCategoryExtra().getPrimaryPanelName());
                    C78088b bVar3 = dVar.f174599a;
                    if (composerBeauty.getSelected()) {
                        bVar3.f175331a.setVisibility(0);
                    } else {
                        bVar3.f175331a.setVisibility(4);
                    }
                }
                dVar.f174599a.setOnClickListener(new C77828d.View$OnClickListenerC77830b(composerBeauty, dVar, z6, z7));
                C84380c.m145132a(dVar.f174599a);
                dVar.mo121454a(z6, z7);
            }
        } else if (viewHolder instanceof C77831e) {
            C77825b bVar4 = this.f174582m.get(i);
            if (bVar4 instanceof C77847j) {
                fVar = bVar4;
            }
            C77847j jVar = fVar;
            if (jVar != null) {
                C77831e eVar = (C77831e) viewHolder;
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f174582m.size() > 1 && i == this.f174582m.size() - 1) {
                    z8 = true;
                }
                C89219l.m154721d(jVar, "");
                eVar.f174610b = jVar;
                eVar.mo121454a(z5, z8);
                eVar.f174609a.setCustomSelected(jVar.f174651d);
                eVar.f174609a.setOnClickListener(new C77831e.View$OnClickListenerC77833b(eVar, jVar));
            }
        } else if (viewHolder instanceof C77849l) {
            C77825b bVar5 = this.f174582m.get(i);
            if (bVar5 instanceof C77848k) {
                fVar = bVar5;
            }
            C77848k kVar = fVar;
            if (kVar != null) {
                C77849l lVar = (C77849l) viewHolder;
                if (i == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f174582m.size() > 1 && i == this.f174582m.size() - 1) {
                    z8 = true;
                }
                C89219l.m154721d(kVar, "");
                lVar.mo121453a(kVar.f174652c);
                lVar.mo121454a(z4, z8);
                lVar.f174654a.setOnClickListener(new C77849l.View$OnClickListenerC77851b(lVar, kVar));
            }
        } else if (viewHolder instanceof C77841h) {
            C77825b bVar6 = this.f174582m.get(i);
            if (bVar6 instanceof C77827c) {
                fVar = bVar6;
            }
            C77827c cVar = fVar;
            if (cVar != null) {
                C77841h hVar = (C77841h) viewHolder;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f174582m.size() <= 1 || i != this.f174582m.size() - 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C89219l.m154721d(cVar, "");
                ComposerBeauty composerBeauty2 = cVar.f174596c;
                UrlModel urlModel2 = new UrlModel();
                Effect effect = composerBeauty2.getEffect();
                if (effect.getIconUrl() != null) {
                    urlModel2.setUri(composerBeauty2.getEffect().getIconUrl().getUri());
                    urlModel2.setUrlList(composerBeauty2.getEffect().getIconUrl().getUrlList());
                }
                hVar.f174633e.setCustomSelected(composerBeauty2.getSelected());
                C78088b bVar7 = hVar.f174633e;
                if (!hVar.f174639k.f174679k || !composerBeauty2.getShowDot()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                bVar7.mo122007a(z3);
                hVar.mo121453a(cVar.f174597d);
                if (cVar.f174597d) {
                    hVar.f174633e.mo122008a(cVar.f174596c.getEnable(), cVar.f174596c.getSelected());
                }
                View view = hVar.f174635g;
                C89219l.m154716b(view, "");
                if (composerBeauty2.getShowRedDot()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                if (!composerBeauty2.isLocalItem() || composerBeauty2.getLocalIconResId() <= 0) {
                    C84402a.m145168a(hVar.f174633e.getImageView(), urlModel2);
                } else {
                    hVar.f174633e.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    hVar.f174633e.getImageView().setImageResource(composerBeauty2.getLocalIconResId());
                }
                hVar.f174633e.setText(effect.getName());
                hVar.f174633e.setOnClickListener(new C77841h.View$OnClickListenerC77844b(urlModel2, composerBeauty2, hVar, cVar, z, z2));
                C84380c.m145132a(hVar.f174633e);
                int downloadState = composerBeauty2.getDownloadState();
                hVar.f174636h = downloadState;
                if (C77878d.m136001c(composerBeauty2)) {
                    ImageView imageView = hVar.f174634f;
                    C89219l.m154716b(imageView, "");
                    imageView.setVisibility(8);
                } else {
                    if (downloadState != 4) {
                        if (downloadState == 8) {
                            ImageView imageView2 = hVar.f174634f;
                            C89219l.m154716b(imageView2, "");
                            imageView2.setVisibility(0);
                            hVar.f174634f.setImageResource(2131230947);
                            if (!hVar.mo121452a().isRunning()) {
                                hVar.mo121452a().start();
                            }
                            ImageView imageView3 = hVar.f174634f;
                            C89219l.m154716b(imageView3, "");
                            imageView3.setVisibility(0);
                        } else if (downloadState != 16) {
                            hVar.mo121455b();
                            ImageView imageView4 = hVar.f174634f;
                            C89219l.m154716b(imageView4, "");
                            imageView4.setVisibility(0);
                        }
                    }
                    hVar.mo121455b();
                    ImageView imageView5 = hVar.f174634f;
                    C89219l.m154716b(imageView5, "");
                    imageView5.setVisibility(8);
                }
                hVar.mo121454a(z, z2);
            }
        }
        this.f174575f = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.d */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.e */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static RecyclerView.ViewHolder m135935a(C77818a aVar, ViewGroup viewGroup, int i) {
        C77835g gVar;
        MethodCollector.m26663i(8264);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 1) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dw, viewGroup, false);
            C89219l.m154716b(a, "");
            C77835g gVar2 = new C77835g(a, aVar);
            gVar2.f174621d = aVar.f174585p;
            gVar = gVar2;
        } else if (i == 2) {
            C77859d dVar = aVar.f174580k;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(dVar, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dt, viewGroup, false);
            C89219l.m154716b(a2, "");
            C78088b a3 = C77841h.C77842a.m135949a(a2, dVar);
            a3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a3.setId(R.id.brs);
            CircleDraweeView imageView = a3.getImageView();
            Context context = a2.getContext();
            C89219l.m154716b(context, "");
            imageView.setBackground(C77841h.C77842a.m135948a(context, dVar.f174673e, dVar.f174672d));
            TextView textView = a3.getTextView();
            if (textView != null) {
                textView.setTextSize(1, dVar.f174669a);
            }
            ((FrameLayout) a2.findViewById(R.id.b4k)).addView(a3, 0);
            a2.findViewById(R.id.brt).setBackgroundResource(dVar.f174680l);
            C77828d dVar2 = new C77828d(a2, dVar);
            dVar2.f174600b = aVar.f174584o;
            gVar = dVar2;
        } else if (i == 3) {
            C77859d dVar3 = aVar.f174580k;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(dVar3, "");
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.du, viewGroup, false);
            C89219l.m154716b(a4, "");
            C78088b a5 = C77841h.C77842a.m135949a(a4, dVar3);
            a5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a5.setId(R.id.brs);
            CircleDraweeView imageView2 = a5.getImageView();
            Context context2 = a4.getContext();
            C89219l.m154716b(context2, "");
            imageView2.setBackground(C77841h.C77842a.m135948a(context2, dVar3.f174673e, dVar3.f174672d));
            a5.getImageView().setActualImageResource(2131232172);
            TextView textView2 = a5.getTextView();
            if (textView2 != null) {
                textView2.setTextSize(1, dVar3.f174669a);
            }
            TextView textView3 = a5.getTextView();
            if (textView3 != null) {
                Context context3 = a4.getContext();
                C89219l.m154716b(context3, "");
                textView3.setText(context3.getResources().getString(0));
            }
            ((FrameLayout) a4.findViewById(R.id.b4k)).addView(a5, 0);
            C77831e eVar = new C77831e(a4, dVar3);
            eVar.f174611c = aVar.f174587r;
            gVar = eVar;
        } else if (i != 4) {
            C77859d dVar4 = aVar.f174580k;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(dVar4, "");
            View a6 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dt, viewGroup, false);
            C89219l.m154716b(a6, "");
            C78088b a7 = C77841h.C77842a.m135949a(a6, dVar4);
            a7.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a7.setId(R.id.brs);
            CircleDraweeView imageView3 = a7.getImageView();
            Context context4 = a6.getContext();
            C89219l.m154716b(context4, "");
            imageView3.setBackground(C77841h.C77842a.m135948a(context4, dVar4.f174673e, dVar4.f174672d));
            TextView textView4 = a7.getTextView();
            if (textView4 != null) {
                textView4.setTextSize(1, dVar4.f174669a);
            }
            ((FrameLayout) a6.findViewById(R.id.b4k)).addView(a7, 0);
            a6.findViewById(R.id.brt).setBackgroundResource(dVar4.f174680l);
            C77841h hVar = new C77841h(a6, dVar4);
            hVar.f174637i = aVar.f174583n;
            gVar = hVar;
        } else {
            C77859d dVar5 = aVar.f174580k;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(dVar5, "");
            View a8 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dv, viewGroup, false);
            C89219l.m154716b(a8, "");
            C78088b a9 = C77841h.C77842a.m135949a(a8, dVar5);
            a9.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a9.setId(R.id.brs);
            CircleDraweeView imageView4 = a9.getImageView();
            Context context5 = a8.getContext();
            C89219l.m154716b(context5, "");
            imageView4.setBackground(C77841h.C77842a.m135948a(context5, dVar5.f174673e, dVar5.f174672d));
            a9.getImageView().setActualImageResource(2131232173);
            TextView textView5 = a9.getTextView();
            if (textView5 != null) {
                textView5.setTextSize(1, dVar5.f174669a);
            }
            TextView textView6 = a9.getTextView();
            if (textView6 != null) {
                Context context6 = a8.getContext();
                C89219l.m154716b(context6, "");
                textView6.setText(context6.getResources().getString(0));
            }
            ((FrameLayout) a8.findViewById(R.id.b4k)).addView(a9, 0);
            C77849l lVar = new C77849l(a8, dVar5);
            lVar.f174655b = aVar.f174586q;
            gVar = lVar;
        }
        try {
            if (gVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(gVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(gVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = gVar.getClass().getName();
        MethodCollector.m26664o(8264);
        return gVar;
    }
}
