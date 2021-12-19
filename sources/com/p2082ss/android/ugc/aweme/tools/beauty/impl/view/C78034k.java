package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C77991d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77971n;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78085a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.k */
public final class C78034k implements AbstractC77873d {

    /* renamed from: a */
    public final RelativeLayout f175057a;

    /* renamed from: b */
    public final StyleTextView f175058b;

    /* renamed from: c */
    public final ImageView f175059c;

    /* renamed from: d */
    public final Context f175060d;

    /* renamed from: e */
    public final View f175061e;

    /* renamed from: f */
    public final C77861e f175062f;

    /* renamed from: g */
    public final C77991d f175063g;

    static {
        Covode.recordClassIndex(91124);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.k$b */
    public static final class C78036b implements AbstractC77893a.AbstractC77895b {

        /* renamed from: a */
        final /* synthetic */ C78034k f175065a;

        static {
            Covode.recordClassIndex(91126);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: b */
        public final void mo121547b() {
            this.f175065a.f175063g.mo121695c();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: a */
        public final void mo121546a() {
            this.f175065a.f175063g.mo121693b();
            this.f175065a.mo121733c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78036b(C78034k kVar) {
            this.f175065a = kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.k$c */
    public static final class C78037c implements AbstractC77893a.AbstractC77895b {

        /* renamed from: a */
        final /* synthetic */ C78034k f175066a;

        static {
            Covode.recordClassIndex(91127);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: b */
        public final void mo121547b() {
            this.f175066a.f175063g.mo121695c();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: a */
        public final void mo121546a() {
            this.f175066a.f175063g.mo121693b();
            this.f175066a.mo121733c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78037c(C78034k kVar) {
            this.f175066a = kVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d
    /* renamed from: b */
    public final void mo121497b() {
        if (this.f175063g.mo121698f()) {
            RelativeLayout relativeLayout = this.f175057a;
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setAlpha(0.5f);
            RelativeLayout relativeLayout2 = this.f175057a;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setClickable(false);
            return;
        }
        RelativeLayout relativeLayout3 = this.f175057a;
        C89219l.m154716b(relativeLayout3, "");
        relativeLayout3.setAlpha(1.0f);
        RelativeLayout relativeLayout4 = this.f175057a;
        C89219l.m154716b(relativeLayout4, "");
        relativeLayout4.setClickable(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d
    /* renamed from: a */
    public final void mo121493a() {
        RelativeLayout relativeLayout = this.f175057a;
        C89219l.m154716b(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (C77886a.f174757n) {
            StyleTextView styleTextView = this.f175058b;
            C89219l.m154716b(styleTextView, "");
            styleTextView.setVisibility(0);
            layoutParams.width = (int) C84912r.m145930a(this.f175060d, 76.0f);
        } else {
            StyleTextView styleTextView2 = this.f175058b;
            C89219l.m154716b(styleTextView2, "");
            styleTextView2.setVisibility(8);
            layoutParams.width = (int) C84912r.m145930a(this.f175060d, 52.0f);
        }
        this.f175058b.setTextSize(2, this.f175062f.f174694f.f174697b);
        this.f175059c.setImageResource(this.f175062f.f174694f.f174698c);
        if (this.f175062f.f174734l) {
            RelativeLayout relativeLayout2 = this.f175057a;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(0);
        } else {
            RelativeLayout relativeLayout3 = this.f175057a;
            C89219l.m154716b(relativeLayout3, "");
            relativeLayout3.setVisibility(4);
        }
        RelativeLayout relativeLayout4 = this.f175057a;
        C89219l.m154716b(relativeLayout4, "");
        relativeLayout4.setLayoutParams(layoutParams);
        this.f175057a.setOnClickListener(new View$OnClickListenerC78035a(this));
        mo121497b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo121733c() {
        T t;
        T t2;
        T t3;
        C77991d dVar = this.f175063g;
        C77991d.C78005n nVar = new C77991d.C78005n(dVar);
        Iterator<T> it = dVar.f174968a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t4 : it.next().getBeautyList()) {
                C77991d.C78004m mVar = new C77991d.C78004m(t4, nVar);
                if (t4.isBeautyMode()) {
                    List<ComposerBeauty> childList = t4.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            mVar.invoke();
                        }
                    }
                } else {
                    mVar.invoke();
                }
            }
        }
        C77991d dVar2 = this.f175063g;
        C77971n<BeautyComposerInfo> nVar2 = new C77971n();
        for (BeautyComposerInfo beautyComposerInfo : dVar2.f174968a.mo121609d()) {
            nVar2.add(beautyComposerInfo);
        }
        for (BeautyComposerInfo beautyComposerInfo2 : nVar2) {
            String str = beautyComposerInfo2.f96062c;
            for (T t5 : dVar2.f174968a.mo121584a()) {
                C89219l.m154721d(t5, "");
                ComposerBeauty composerBeauty = (ComposerBeauty) C89070n.m154583g((List) t5.getBeautyList());
                if (composerBeauty == null || !composerBeauty.isBeautyMode()) {
                    Iterator<T> it3 = t5.getBeautyList().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (C89219l.m154714a((Object) t2.getEffect().getEffectId(), (Object) str)) {
                            break;
                        }
                    }
                    T t6 = t2;
                    if (t6 != null) {
                        dVar2.mo121692a(t6, null);
                    }
                } else {
                    Iterator<T> it4 = t5.getBeautyList().iterator();
                    while (it4.hasNext()) {
                        List<ComposerBeauty> childList2 = it4.next().getChildList();
                        if (childList2 != null) {
                            Iterator<T> it5 = childList2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    t3 = null;
                                    break;
                                }
                                t3 = it5.next();
                                if (C89219l.m154714a((Object) t3.getEffect().getEffectId(), (Object) str)) {
                                    break;
                                }
                            }
                            T t7 = t3;
                            if (t7 != null) {
                                dVar2.mo121692a(t7, null);
                            }
                        }
                    }
                }
            }
        }
        List<BeautyCategory> a = dVar2.f174968a.mo121584a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t8 : a) {
            if (t8.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t8);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            Iterator<T> it6 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    t = null;
                    break;
                }
                t = it6.next();
                T t9 = t;
                if (t9.getExtra().getDefault() && t9.getEnable()) {
                    break;
                }
            }
            T t10 = t;
            if (t10 != null) {
                C77991d.m136265a(dVar2, t10, beautyCategory.getBeautyList());
                dVar2.mo121694b(t10);
            } else {
                List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                if (!(beautyList == null || beautyList.isEmpty() || beautyList == null)) {
                    C77991d.m136265a(dVar2, beautyList.get(0), beautyCategory.getBeautyList());
                    dVar2.mo121694b(beautyList.get(0));
                }
            }
        }
        dVar2.mo121696d();
        this.f175063g.mo121690a();
        this.f175063g.mo121697e();
        mo121497b();
        AbstractC77871b bVar = (AbstractC77871b) this.f175063g.f174972e.mo121716a(AbstractC77871b.class);
        if (bVar != null) {
            bVar.mo121474b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d
    /* renamed from: a */
    public final void mo121495a(Map<ComposerBeauty, Float> map) {
        C89219l.m154721d(map, "");
        C77991d dVar = this.f175063g;
        C89219l.m154721d(map, "");
        for (Map.Entry<ComposerBeauty, Float> entry : map.entrySet()) {
            C77991d.C78003l.m136287a(entry.getKey(), new C77991d.C78002k(entry, dVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.k$a */
    static final class View$OnClickListenerC78035a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78034k f175064a;

        static {
            Covode.recordClassIndex(91125);
        }

        View$OnClickListenerC78035a(C78034k kVar) {
            this.f175064a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C78034k kVar = this.f175064a;
            Context context = kVar.f175060d;
            AbstractC77893a aVar = kVar.f175062f.f174733k;
            if (aVar != null) {
                AbstractC77893a.C77894a a = new AbstractC77893a.C77894a().mo121541a(context);
                String string = context.getString(R.string.a3o);
                C89219l.m154716b(string, "");
                AbstractC77893a.C77894a a2 = a.mo121542a(string);
                String string2 = context.getString(R.string.a3l);
                C89219l.m154716b(string2, "");
                AbstractC77893a.C77894a b = a2.mo121543b(string2);
                String string3 = context.getString(R.string.a3m);
                C89219l.m154716b(string3, "");
                AbstractC77893a.C77894a c = b.mo121544c(string3);
                String string4 = context.getString(R.string.a3n);
                C89219l.m154716b(string4, "");
                AbstractC77893a.C77894a d = c.mo121545d(string4);
                d.f174770f = new C78036b(kVar);
                aVar.mo22726a(d);
            } else {
                C89219l.m154721d(context, "");
                AbstractC77893a.C77894a a3 = new AbstractC77893a.C77894a().mo121541a(context);
                String string5 = context.getString(R.string.a3o);
                C89219l.m154716b(string5, "");
                AbstractC77893a.C77894a a4 = a3.mo121542a(string5);
                String string6 = context.getString(R.string.a3l);
                C89219l.m154716b(string6, "");
                AbstractC77893a.C77894a b2 = a4.mo121543b(string6);
                String string7 = context.getString(R.string.a3m);
                C89219l.m154716b(string7, "");
                AbstractC77893a.C77894a c2 = b2.mo121544c(string7);
                String string8 = context.getString(R.string.a3n);
                C89219l.m154716b(string8, "");
                AbstractC77893a.C77894a d2 = c2.mo121545d(string8);
                d2.f174770f = new C78037c(kVar);
                C78085a.m136499a(d2);
            }
            AbstractC78049b bVar = kVar.f175063g.f174971d.f174956a;
            if (bVar != null) {
                bVar.mo121775a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d
    /* renamed from: a */
    public final void mo121494a(List<ComposerBeauty> list) {
        C89219l.m154721d(list, "");
        C77991d dVar = this.f175063g;
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C77991d.C78001j.m136286a(it.next(), new C77991d.C77998g(dVar));
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            C77991d.C78001j.m136286a(it2.next(), new C77991d.C77999h(dVar));
        }
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            C77991d.C78001j.m136286a(it3.next(), new C77991d.C78000i(dVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d
    /* renamed from: a */
    public final void mo121496a(boolean z) {
        T t;
        C77991d dVar = this.f175063g;
        Iterator<T> it = dVar.f174968a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            dVar.f174968a.mo121588a((ComposerBeauty) t3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    dVar.f174968a.mo121588a((ComposerBeauty) t2, z);
                    dVar.mo121699g();
                }
            }
        }
    }

    public C78034k(Context context, View view, C77861e eVar, C77991d dVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        this.f175060d = context;
        this.f175061e = view;
        this.f175062f = eVar;
        this.f175063g = dVar;
        this.f175057a = (RelativeLayout) view.findViewById(R.id.dl0);
        this.f175058b = (StyleTextView) view.findViewById(R.id.etx);
        this.f175059c = (ImageView) view.findViewById(R.id.bub);
    }
}
