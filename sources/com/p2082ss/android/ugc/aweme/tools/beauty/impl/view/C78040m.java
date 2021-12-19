package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77875f;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.tools.view.style.StyleTabLayout;
import com.p2082ss.android.ugc.tools.view.style.StyleView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.m */
public final class C78040m implements AbstractC77875f {

    /* renamed from: a */
    public final StyleTabLayout f175079a;

    /* renamed from: b */
    public Context f175080b;

    /* renamed from: c */
    public View f175081c;

    /* renamed from: d */
    public C77861e f175082d;

    /* renamed from: e */
    public C78011f f175083e;

    /* renamed from: f */
    private final StyleView f175084f = ((StyleView) this.f175081c.findViewById(R.id.fam));

    static {
        Covode.recordClassIndex(91130);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77875f
    /* renamed from: a */
    public final void mo121502a() {
        this.f175079a.requestLayout();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.m$a */
    static final class C78041a implements TabLayout.AbstractC73098b {

        /* renamed from: a */
        final /* synthetic */ C78040m f175085a;

        /* renamed from: b */
        final /* synthetic */ List f175086b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f175087c;

        static {
            Covode.recordClassIndex(91131);
        }

        C78041a(C78040m mVar, List list, ArrayList arrayList) {
            this.f175085a = mVar;
            this.f175086b = list;
            this.f175087c = arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73098b
        /* renamed from: a */
        public final void mo86256a(TabLayout.C73104f fVar) {
            Object obj;
            fVar.mo115586a();
            Iterator it = this.f175086b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ArrayList arrayList = this.f175087c;
                C89219l.m154716b(fVar, "");
                if (C89219l.m154714a(arrayList.get(fVar.f164124e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                this.f175085a.f175083e.mo121715a(beautyCategory);
            }
        }
    }

    /* renamed from: b */
    private final void m136362b(List<BeautyCategory> list) {
        T t;
        TabLayout.C73104f a;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getSelected()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (a = this.f175079a.mo115520a(list.indexOf(t2))) != null) {
            a.mo115586a();
            this.f175083e.mo121715a(t2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.m$b */
    public static final class C78042b implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ C78040m f175088a;

        /* renamed from: b */
        final /* synthetic */ List f175089b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f175090c;

        static {
            Covode.recordClassIndex(91132);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            Object obj;
            if (fVar != null) {
                Iterator it = this.f175089b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C89219l.m154714a(this.f175090c.get(fVar.f164124e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    C78011f fVar2 = this.f175088a.f175083e;
                    C89219l.m154721d(beautyCategory, "");
                    fVar2.f175002a.mo121591a(beautyCategory.getCategoryResponse().getId());
                    fVar2.f175005d.mo121480a(beautyCategory);
                }
            }
        }

        C78042b(C78040m mVar, List list, ArrayList arrayList) {
            this.f175088a = mVar;
            this.f175089b = list;
            this.f175090c = arrayList;
        }
    }

    /* renamed from: c */
    private final void m136363c(List<BeautyCategory> list) {
        this.f175079a.mo115533b();
        for (T t : list) {
            C41093a.m82765c("LJT addTab: " + t.getCategoryResponse().getName());
            Context context = this.f175080b;
            C84984j a = C84383b.m145134a(context);
            if (TextUtils.isEmpty(t.getCategoryResponse().getIcon_normal_url())) {
                a.setText(t.getCategoryResponse().getName());
            } else {
                String icon_normal_url = t.getCategoryResponse().getIcon_normal_url();
                if (icon_normal_url == null) {
                    icon_normal_url = "";
                }
                a.setImage(icon_normal_url);
            }
            a.setSelectColor(context.getResources().getColor(this.f175082d.f174693e.f174715c));
            a.setUnSelectColor(context.getResources().getColor(this.f175082d.f174693e.f174716d));
            TabLayout.C73104f a2 = this.f175079a.mo115519a().mo115584a(a);
            C89219l.m154716b(a2, "");
            TabLayout.C73108i iVar = a2.f164127h;
            if (iVar != null) {
                iVar.setBackgroundColor(C0643b.m2378c(iVar.getContext(), R.color.ur));
            }
            this.f175079a.mo115526a(a2, false);
        }
        this.f175079a.setSelectedTabIndicatorColor(this.f175080b.getResources().getColor(this.f175082d.f174693e.f174717e));
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77875f
    /* renamed from: a */
    public final void mo121503a(List<BeautyCategory> list) {
        int i;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCategoryResponse().getId());
        }
        if (list.size() <= 1) {
            this.f175079a.setHideIndicatorView(true);
        } else {
            this.f175079a.setHideIndicatorView(false);
        }
        if (list.size() == 1) {
            StyleTabLayout styleTabLayout = this.f175079a;
            C89219l.m154716b(styleTabLayout, "");
            styleTabLayout.setTabMode(1);
            StyleTabLayout styleTabLayout2 = this.f175079a;
            C89219l.m154716b(styleTabLayout2, "");
            ViewGroup.LayoutParams layoutParams = styleTabLayout2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = (int) C84912r.m145930a(this.f175080b, 76.0f);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) C84912r.m145930a(this.f175080b, 76.0f));
            StyleTabLayout styleTabLayout3 = this.f175079a;
            C89219l.m154716b(styleTabLayout3, "");
            styleTabLayout3.setLayoutParams(layoutParams2);
        } else {
            StyleTabLayout styleTabLayout4 = this.f175079a;
            C89219l.m154716b(styleTabLayout4, "");
            styleTabLayout4.setTabMode(0);
            StyleTabLayout styleTabLayout5 = this.f175079a;
            C89219l.m154716b(styleTabLayout5, "");
            ViewGroup.LayoutParams layoutParams3 = styleTabLayout5.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            if (this.f175082d.f174735m) {
                i = (int) C84912r.m145930a(this.f175080b, 56.0f);
            } else {
                i = 0;
            }
            layoutParams4.leftMargin = i;
            int i3 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart(i);
            StyleTabLayout styleTabLayout6 = this.f175079a;
            C89219l.m154716b(styleTabLayout6, "");
            styleTabLayout6.setLayoutParams(layoutParams4);
        }
        m136363c(list);
        this.f175079a.setOnTabClickListener(new C78041a(this, list, arrayList));
        this.f175079a.mo115524a(new C78042b(this, list, arrayList));
        m136362b(list);
        if (this.f175082d.f174693e.f174714b) {
            StyleTabLayout styleTabLayout7 = this.f175079a;
            C89219l.m154716b(styleTabLayout7, "");
            styleTabLayout7.setVisibility(0);
        } else {
            StyleTabLayout styleTabLayout8 = this.f175079a;
            C89219l.m154716b(styleTabLayout8, "");
            styleTabLayout8.setVisibility(4);
        }
        if (list.size() > 4) {
            StyleView styleView = this.f175084f;
            C89219l.m154716b(styleView, "");
            styleView.setVisibility(0);
            return;
        }
        StyleView styleView2 = this.f175084f;
        C89219l.m154716b(styleView2, "");
        styleView2.setVisibility(8);
    }

    public C78040m(Context context, View view, C77861e eVar, C78011f fVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        this.f175080b = context;
        this.f175081c = view;
        this.f175082d = eVar;
        this.f175083e = fVar;
        this.f175079a = (StyleTabLayout) view.findViewById(R.id.ejw);
    }
}
