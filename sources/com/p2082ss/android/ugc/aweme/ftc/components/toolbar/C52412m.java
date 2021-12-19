package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m */
public final class C52412m {

    /* renamed from: a */
    AbstractC23317a f120710a;

    /* renamed from: b */
    final ActivityC0945e f120711b;

    /* renamed from: c */
    final AbstractC22186b f120712c;

    /* renamed from: d */
    private final C88411a f120713d = new C88411a();

    /* renamed from: e */
    private final List<C89378p<LiveData<Object>, AbstractC1214u<Object>>> f120714e = new ArrayList();

    /* renamed from: f */
    private final VideoPublishEditModel f120715f;

    /* renamed from: g */
    private final FTCEditToolbarViewModel f120716g;

    static {
        Covode.recordClassIndex(61804);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo88174b() {
        AbstractC23317a aVar = this.f120710a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo88171a() {
        this.f120713d.mo142944a();
        for (T t : this.f120714e) {
            ((LiveData) t.getFirst()).removeObserver((AbstractC1214u) t.getSecond());
        }
        this.f120714e.clear();
        mo88174b();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$c */
    static final class C52415c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f120719a;

        static {
            Covode.recordClassIndex(61807);
        }

        C52415c(View view) {
            this.f120719a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f120719a.setEnabled(booleanValue);
                if (booleanValue) {
                    view = this.f120719a;
                    f = 1.0f;
                } else {
                    view = this.f120719a;
                    f = 0.5f;
                }
                view.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$e */
    static final class C52417e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f120723a;

        static {
            Covode.recordClassIndex(61809);
        }

        C52417e(View view) {
            this.f120723a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    view = this.f120723a;
                    f = 1.0f;
                } else {
                    view = this.f120723a;
                    f = 0.5f;
                }
                view.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$f */
    static final class C52418f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f120724a;

        static {
            Covode.recordClassIndex(61810);
        }

        C52418f(View view) {
            this.f120724a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f120724a;
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: b */
    public final void mo88175b(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f120716g.mo88160i().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m97310a(tVar, this.f120711b, new C52415c(view));
            }
        }
    }

    /* renamed from: c */
    public final void mo88176c(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f120716g.mo88161j().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m97310a(tVar, this.f120711b, new C52417e(view));
            }
        }
    }

    /* renamed from: d */
    public final void mo88177d(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f120716g.mo88162k().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m97310a(tVar, this.f120711b, new C52416d(this, intValue, view));
            }
        }
    }

    /* renamed from: a */
    public final void mo88173a(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f120716g.mo88159h().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m97310a(tVar, this.f120711b, new C52418f(view));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$d */
    static final class C52416d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52412m f120720a;

        /* renamed from: b */
        final /* synthetic */ int f120721b;

        /* renamed from: c */
        final /* synthetic */ View f120722c;

        static {
            Covode.recordClassIndex(61808);
        }

        C52416d(C52412m mVar, int i, View view) {
            this.f120720a = mVar;
            this.f120721b = i;
            this.f120722c = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C52421p pVar;
            View view;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C52412m mVar = this.f120720a;
                int i2 = this.f120721b;
                View view2 = this.f120722c;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 6 && booleanValue) {
                                    AbstractC23332b a = new C23329a(mVar.f120711b).mo38023e(R.string.bjm).mo38030a(5000L).mo38036a(true).mo38034a(EnumC23352h.START);
                                    if (view2.getHeight() == 0) {
                                        C52388d dVar = (C52388d) mVar.f120712c.mo36386a("FTCEditTitleBarScene");
                                        if (dVar != null && (pVar = dVar.f120679g) != null && (view = pVar.f120728b) != null) {
                                            a.mo38041b(view);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        View findViewById = view2.findViewById(R.id.z7);
                                        if (findViewById != null) {
                                            a.mo38041b(findViewById);
                                        } else {
                                            a.mo38041b(view2);
                                        }
                                    }
                                    a.mo38012d().mo38001a();
                                    C71529w.m126422b("voice");
                                }
                            } else if (booleanValue) {
                                if (C71529w.m126423b()) {
                                    i = R.string.axk;
                                } else {
                                    i = R.string.bjl;
                                }
                                new C23329a(mVar.f120711b).mo38023e(i).mo38030a(5000L).mo38036a(true).mo38041b(view2).mo38034a(EnumC23352h.TOP).mo38012d().mo38001a();
                                if (C71529w.m126423b()) {
                                    C71529w.m126422b("custom_sticker");
                                } else {
                                    C71529w.m126422b("sticker");
                                }
                            }
                        } else if (booleanValue) {
                            ((C23329a) new C23329a(mVar.f120711b).mo38041b(view2).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.axw).mo38036a(true).mo38030a(5000L).mo38012d().mo38001a();
                            C71529w.m126422b("text");
                        }
                    } else if (booleanValue) {
                        if (mVar.f120710a == null) {
                            mVar.f120710a = new C23329a(mVar.f120711b).mo38023e(R.string.bji).mo38030a(5000L).mo38041b(view2).mo38034a(EnumC23352h.TOP).mo38012d();
                        }
                        AbstractC23317a aVar = mVar.f120710a;
                        if (aVar != null) {
                            aVar.mo38001a();
                        }
                        C71529w.m126422b("effect");
                    } else {
                        mVar.mo88174b();
                    }
                } else if (booleanValue) {
                    ((C23329a) new C23329a(mVar.f120711b).mo38041b(view2).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.bjj).mo38036a(true).mo38030a(5000L).mo38012d().mo38001a();
                    C71529w.m126422b("music");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$a */
    static final class C52413a extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71393k f120717a;

        static {
            Covode.recordClassIndex(61805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52413a(C71393k kVar) {
            super(2);
            this.f120717a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            this.f120717a.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.m$b */
    static final class C52414b extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Drawable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71393k f120718a;

        static {
            Covode.recordClassIndex(61806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52414b(C71393k kVar) {
            super(2);
            this.f120718a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Drawable drawable) {
            Drawable drawable2 = drawable;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(drawable2, "");
            this.f120718a.setIcon(drawable2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo88172a(AbstractC20382b bVar, C71393k kVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(kVar, "");
        bVar.selectNonNullSubscribe(this.f120716g, C52419n.f120725a, new C20370ah(), new C52413a(kVar));
        bVar.selectNonNullSubscribe(this.f120716g, C52420o.f120726a, new C20370ah(), new C52414b(kVar));
    }

    /* renamed from: a */
    private final <T> void m97310a(LiveData<T> liveData, AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        liveData.observe(mVar, uVar);
        List<C89378p<LiveData<Object>, AbstractC1214u<Object>>> list = this.f120714e;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        list.add(new C89378p<>(liveData, uVar));
    }

    public C52412m(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel, FTCEditToolbarViewModel fTCEditToolbarViewModel, AbstractC22186b bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(fTCEditToolbarViewModel, "");
        C89219l.m154721d(bVar, "");
        this.f120711b = eVar;
        this.f120715f = videoPublishEditModel;
        this.f120716g = fTCEditToolbarViewModel;
        this.f120712c = bVar;
    }
}
