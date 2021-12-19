package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.View$OnAttachStateChangeListenerC34123f;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.g */
public abstract class AbstractC34151g extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements AbstractC34107a {

    /* renamed from: a */
    private List<? extends Aweme> f80755a = new ArrayList();

    /* renamed from: i */
    public final RecyclerView f80756i;

    static {
        Covode.recordClassIndex(41085);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.AbstractC51062a
    /* renamed from: e */
    public boolean mo60483e() {
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* renamed from: a */
    public List<Aweme> mo60373a() {
        return this.f80755a;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a
    /* renamed from: b */
    public void mo60404b() {
        int childCount;
        if (this.f80756i.getLayoutManager() != null && (childCount = this.f80756i.getChildCount()) > 0) {
            int i = 0;
            do {
                RecyclerView recyclerView = this.f80756i;
                RecyclerView.ViewHolder a = recyclerView.mo4393a(recyclerView.getChildAt(i));
                if (a instanceof AbstractC34186b.AbstractC34189c) {
                    ((AbstractC34186b.AbstractC34189c) a).bi_();
                }
                i++;
            } while (i < childCount);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a
    /* renamed from: c */
    public void mo60405c() {
        int childCount;
        if (this.f80756i.getLayoutManager() != null && (childCount = this.f80756i.getChildCount()) > 0) {
            int i = 0;
            do {
                RecyclerView recyclerView = this.f80756i;
                RecyclerView.ViewHolder a = recyclerView.mo4393a(recyclerView.getChildAt(i));
                if (a instanceof AbstractC34186b.AbstractC34189c) {
                    ((AbstractC34186b.AbstractC34189c) a).bg_();
                }
                i++;
            } while (i < childCount);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a
    /* renamed from: d */
    public final boolean mo60406d() {
        int childCount;
        if (this.f80756i.getLayoutManager() == null || (childCount = this.f80756i.getChildCount()) <= 0) {
            return false;
        }
        int i = 0;
        do {
            RecyclerView recyclerView = this.f80756i;
            RecyclerView.ViewHolder a = recyclerView.mo4393a(recyclerView.getChildAt(i));
            if ((a instanceof AbstractC34186b.AbstractC34189c) && ((AbstractC34186b.AbstractC34189c) a).aZ_()) {
                return true;
            }
            i++;
        } while (i < childCount);
        return false;
    }

    /* renamed from: a */
    public void mo60376a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f80755a = list;
        notifyDataSetChanged();
    }

    public AbstractC34151g(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f80756i = recyclerView;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b
    /* renamed from: a */
    public void mo60482a(Aweme aweme) {
        String str;
        if (this.f80756i.getLayoutManager() != null) {
            C0692e<Integer, Integer> a = C80494gh.m139517a(this.f80756i);
            if (a.f2750a != null && a.f2751b != null) {
                F f = a.f2750a;
                if (f == null) {
                    C89219l.m154715b();
                }
                int intValue = f.intValue();
                S s = a.f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(s, "");
                int intValue2 = s.intValue();
                if (intValue <= intValue2) {
                    while (true) {
                        if (intValue >= 0 && intValue < mo60373a().size()) {
                            Aweme aweme2 = mo60373a().get(intValue);
                            String str2 = null;
                            if (aweme2.getAid() != null) {
                                String aid = aweme2.getAid();
                                if (aweme != null) {
                                    str = aweme.getAid();
                                } else {
                                    str = null;
                                }
                                if (!C89219l.m154714a((Object) aid, (Object) str)) {
                                    RecyclerView.ViewHolder f2 = this.f80756i.mo4451f(intValue);
                                    if (f2 instanceof AbstractC34186b.AbstractC34189c) {
                                        ((AbstractC34186b.AbstractC34189c) f2).bi_();
                                    }
                                }
                            }
                            String aid2 = aweme2.getAid();
                            if (aweme != null) {
                                str2 = aweme.getAid();
                            }
                            if (C89219l.m154714a((Object) aid2, (Object) str2)) {
                                RecyclerView.ViewHolder f3 = this.f80756i.mo4451f(intValue);
                                if (f3 instanceof View$OnAttachStateChangeListenerC34123f) {
                                    LinearGradientDraweeView linearGradientDraweeView = ((View$OnAttachStateChangeListenerC34123f) f3).f80687o;
                                    C89219l.m154716b(linearGradientDraweeView, "");
                                    linearGradientDraweeView.setVisibility(8);
                                }
                            }
                        }
                        if (intValue != intValue2) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
