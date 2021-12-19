package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46091h;
import com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46159m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.C84396b;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.C84397c;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.EnumC84384a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.k */
public final class C46153k extends RecyclerView.AbstractC1350a<C46154a> {

    /* renamed from: a */
    public int f107451a = -1;

    /* renamed from: b */
    public final List<C46079a> f107452b;

    /* renamed from: c */
    public final AbstractC46187r<C46079a> f107453c;

    /* renamed from: d */
    public final AbstractC46187r<C46091h> f107454d;

    /* renamed from: e */
    public final AbstractC89172b<C46079a, C89391z> f107455e;

    static {
        Covode.recordClassIndex(54712);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C46154a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89077a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f107452b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.k$a */
    public final class C46154a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final C85035a f107456a;

        /* renamed from: b */
        public final ImageView f107457b;

        /* renamed from: c */
        EnumC84384a f107458c = EnumC84384a.NOT_DOWNLOAD;

        /* renamed from: d */
        final /* synthetic */ C46153k f107459d;

        /* renamed from: e */
        private final AbstractC89244h f107460e = C89250i.m154773a((AbstractC89171a) new C46156a(this));

        static {
            Covode.recordClassIndex(54713);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ObjectAnimator mo78369a() {
            return (ObjectAnimator) this.f107460e.getValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo78370b() {
            mo78369a().cancel();
            ImageView imageView = this.f107457b;
            C89219l.m154716b(imageView, "");
            imageView.setRotation(0.0f);
            this.f107457b.setImageResource(2131232276);
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.k$a$a */
        static final class C46156a extends AbstractC89220m implements AbstractC89171a<ObjectAnimator> {

            /* renamed from: a */
            final /* synthetic */ C46154a f107462a;

            static {
                Covode.recordClassIndex(54715);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46156a(C46154a aVar) {
                super(0);
                this.f107462a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ObjectAnimator invoke() {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f107462a.f107457b, "rotation", 0.0f, 360.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(800L);
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.setInterpolator(new LinearInterpolator());
                return ofFloat;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46154a(C46153k kVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f107459d = kVar;
            C85035a aVar = (C85035a) view.findViewById(R.id.bve);
            this.f107456a = aVar;
            this.f107457b = (ImageView) view.findViewById(R.id.bvd);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46153k.C46154a.View$OnClickListenerC461551 */

                /* renamed from: a */
                final /* synthetic */ C46154a f107461a;

                static {
                    Covode.recordClassIndex(54714);
                }

                {
                    this.f107461a = r1;
                }

                public final void onClick(View view) {
                    int adapterPosition;
                    ClickAgent.onClick(view);
                    if (this.f107461a.getAdapterPosition() != -1 && this.f107461a.getAdapterPosition() != this.f107461a.f107459d.f107451a) {
                        int i = this.f107461a.f107459d.f107451a;
                        C46153k kVar = this.f107461a.f107459d;
                        if (this.f107461a.f107458c != EnumC84384a.DOWNLOADED) {
                            AbstractC89172b<C46079a, C89391z> bVar = this.f107461a.f107459d.f107455e;
                            if (bVar != null) {
                                bVar.invoke(this.f107461a.f107459d.f107452b.get(this.f107461a.getAdapterPosition()));
                            }
                            adapterPosition = this.f107461a.f107459d.f107451a;
                        } else {
                            AbstractC89172b<C46079a, C89391z> bVar2 = this.f107461a.f107459d.f107455e;
                            if (bVar2 != null) {
                                bVar2.invoke(this.f107461a.f107459d.f107452b.get(this.f107461a.getAdapterPosition()));
                            }
                            adapterPosition = this.f107461a.getAdapterPosition();
                        }
                        kVar.f107451a = adapterPosition;
                        this.f107461a.f107459d.notifyItemChanged(i);
                        this.f107461a.f107459d.notifyItemChanged(this.f107461a.getAdapterPosition());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.k$b */
    public static final class C46157b extends AbstractC89220m implements AbstractC89172b<C46159m.C46160a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f107463a;

        static {
            Covode.recordClassIndex(54716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46157b(View view) {
            super(1);
            this.f107463a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C46159m.C46160a aVar) {
            C46159m.C46160a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f107480a = true;
            View view = this.f107463a;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            aVar2.f107483d = (int) C84912r.m145930a(context, 52.0f);
            View view2 = this.f107463a;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            aVar2.f107482c = (int) C84912r.m145930a(context2, 52.0f);
            aVar2.f107484e = 2131230949;
            aVar2.f107490k = true;
            aVar2.f107485f = true;
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C46154a aVar, int i) {
        boolean z;
        boolean z2;
        EnumC84384a aVar2;
        C46154a aVar3 = aVar;
        C89219l.m154721d(aVar3, "");
        if (this.f107452b.size() > i) {
            C46079a aVar4 = aVar3.f107459d.f107452b.get(i);
            if (aVar4.f107317e.f107335b) {
                C84402a.m145165a(aVar3.f107456a.getImageView(), 2131232278);
            } else if (aVar4.f107317e.f107334a) {
                C84402a.m145165a(aVar3.f107456a.getImageView(), 2131232279);
            } else {
                UrlModel urlModel = new UrlModel();
                com.p2082ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = aVar4.f106810b.getIconUrl();
                urlModel.setUri(iconUrl.getUri());
                urlModel.setUrlList(iconUrl.getUrlList());
                C84402a.m145169a(aVar3.f107456a.getImageView(), urlModel, -1, -1);
            }
            aVar3.f107456a.setText(aVar4.f106810b.getName());
            aVar3.f107456a.getImageView().setBackgroundResource(R.drawable.a80);
            C85035a aVar5 = aVar3.f107456a;
            if (aVar3.getAdapterPosition() == aVar3.f107459d.f107451a) {
                z = true;
            } else {
                z = false;
            }
            aVar5.setCustomSelected(z);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(aVar3.f107459d.f107453c.mo78351a(aVar4)));
            Iterator<T> it = aVar4.f107316d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(aVar3.f107459d.f107454d.mo78351a(it.next())));
            }
            int a = C84396b.m145139a(arrayList);
            if (a == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                aVar2 = EnumC84384a.DOWNLOADING;
            } else if (a == 2 || a == 1 || a == 32 || !C84397c.m145140a(a)) {
                aVar2 = EnumC84384a.NOT_DOWNLOAD;
            } else {
                aVar2 = EnumC84384a.DOWNLOADED;
            }
            aVar3.f107458c = aVar2;
            int i2 = C46158l.f107464a[aVar3.f107458c.ordinal()];
            if (i2 == 1) {
                ImageView imageView = aVar3.f107457b;
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(0);
                aVar3.mo78370b();
            } else if (i2 == 2) {
                ImageView imageView2 = aVar3.f107457b;
                C89219l.m154716b(imageView2, "");
                imageView2.setVisibility(8);
                aVar3.mo78370b();
            } else if (i2 != 3) {
                ImageView imageView3 = aVar3.f107457b;
                C89219l.m154716b(imageView3, "");
                imageView3.setVisibility(0);
                aVar3.mo78370b();
            } else {
                ImageView imageView4 = aVar3.f107457b;
                C89219l.m154716b(imageView4, "");
                imageView4.setVisibility(0);
                aVar3.f107457b.setImageResource(2131232277);
                aVar3.mo78369a().start();
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89077a(C46153k kVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11686);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.z_, viewGroup, false);
        C89219l.m154716b(a2, "");
        Context context = a2.getContext();
        C89219l.m154716b(context, "");
        C46157b bVar = new C46157b(a2);
        C46159m.C46160a aVar = new C46159m.C46160a(context);
        bVar.invoke(aVar);
        C46159m mVar = new C46159m(aVar.f107495p, aVar.f107480a, aVar.f107481b, aVar.f107482c, aVar.f107483d, aVar.f107484e, aVar.f107485f, aVar.f107486g, aVar.f107487h, aVar.f107488i, aVar.f107489j, aVar.f107490k, aVar.f107491l, aVar.f107492m, aVar.f107493n, aVar.f107494o);
        if (C84370a.f188623l.f188630f) {
            TextView textView = mVar.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = mVar.getTextView();
            if (textView2 != null) {
                C84981g.m146055a(textView2);
            }
        } else {
            TextView textView3 = mVar.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = mVar.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        mVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        mVar.setId(R.id.bve);
        ((FrameLayout) a2.findViewById(R.id.b4e)).addView(mVar, 0);
        C46154a aVar2 = new C46154a(kVar, a2);
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
        MethodCollector.m26664o(11686);
        return aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.effect.r<? super com.ss.android.ugc.aweme.editSticker.text.bean.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.effect.r<? super com.ss.android.ugc.aweme.editSticker.text.bean.h> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.bean.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46153k(List<C46079a> list, AbstractC46187r<? super C46079a> rVar, AbstractC46187r<? super C46091h> rVar2, AbstractC89172b<? super C46079a, C89391z> bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(rVar2, "");
        this.f107452b = list;
        this.f107453c = rVar;
        this.f107454d = rVar2;
        this.f107455e = bVar;
    }
}
