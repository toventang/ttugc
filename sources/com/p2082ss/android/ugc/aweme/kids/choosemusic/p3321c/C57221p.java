package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38216ad;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57247i;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57289m;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.p */
public final class C57221p extends AbstractC57199d implements AbstractC39063h.AbstractC39067a, AbstractC57233a {

    /* renamed from: l */
    private String f130338l;

    /* renamed from: m */
    private String f130339m;

    /* renamed from: n */
    private String f130340n;

    /* renamed from: o */
    private boolean f130341o;

    /* renamed from: p */
    private String f130342p;

    /* renamed from: q */
    private C38216ad f130343q;

    /* renamed from: r */
    private int f130344r;

    /* renamed from: s */
    private List<MusicModel> f130345s;

    /* renamed from: t */
    private int f130346t;

    /* renamed from: u */
    private int f130347u;

    static {
        Covode.recordClassIndex(67126);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "music_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo94441b(Object obj) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: c */
    public final String mo60170c() {
        return "refresh_status_music_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: d */
    public final String mo60171d() {
        return "loadmore_status_music_list";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: n */
    public final int mo94422n() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: o */
    public final String mo94423o() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: q */
    public final void mo94445q() {
        if (this.f130277d != null) {
            this.f130277d.mo94457a(this.f130338l, this.f130344r);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: r */
    public final void mo94446r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo94449m() {
        if (this.f130277d != null && this.f130278e != null) {
            C33935b bVar = (C33935b) this.f130278e.mo60192a("music_list");
            if ((this.f130279j instanceof AbstractC57279e) && ((AbstractC57279e) this.f130279j).f130492i) {
                if (this.f130279j != null) {
                    this.f130279j.mo60175a();
                }
                C57238a aVar = this.f130277d;
                String str = this.f130338l;
                int intValue = ((Integer) bVar.mo60174a("list_cursor")).intValue();
                int i = this.f130344r;
                if (!aVar.f130383e) {
                    aVar.f130383e = true;
                    ChooseMusicApi.m103646a(str, intValue, 16, i).mo5534a(new C57247i(aVar), C1731i.f5564c, null);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        if (this.f130345s == null) {
            this.f130277d.mo94457a(this.f130338l, this.f130344r);
            return;
        }
        this.f130278e.mo60191a("refresh_status_music_list", (Object) 0);
        C33935b bVar = new C33935b();
        bVar.mo60173a("list_cursor", Integer.valueOf(this.f130346t)).mo60173a("list_hasmore", Integer.valueOf(this.f130347u)).mo60173a("action_type", 1).mo60173a("list_data", this.f130345s);
        this.f130278e.mo60191a("music_list", bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: b */
    public final AbstractC33936c mo94418b(View view) {
        C57289m mVar;
        if (this.f130345s != null) {
            mVar = new C57289m(getContext(), view, this, this, this, this.f130280k);
        } else {
            mVar = new C57289m(getContext(), view, this, R.string.cm7, this, this, this.f130280k);
        }
        if (this.f130344r != 2) {
            mVar.f130484a.setTitle(this.f130339m);
        } else if (mVar.f130487d != null) {
            mVar.f130487d.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mVar.f130486c.getLayoutParams();
        layoutParams.height = -1;
        mVar.f130486c.setLayoutParams(layoutParams);
        mVar.mo94491a(this.f130341o);
        mVar.mo94490a(this);
        C57171a aVar = new C57171a(this.f130340n, this.f130339m, this.f130342p, C57268c.f130442a);
        aVar.mo94370a(this.f130338l);
        mVar.mo94489a(aVar);
        mVar.mo94483a(new C57223q(this));
        return mVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f130338l = arguments.getString("music_class_id");
            this.f130339m = arguments.getString("music_class_name");
            this.f130340n = arguments.getString("music_class_enter_from");
            this.f130341o = arguments.getBoolean("music_class_is_hot", false);
            this.f130342p = arguments.getString("music_class_enter_method");
            this.f130344r = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.f130345s = (List) serializable;
            }
            this.f130346t = arguments.getInt("music_list_cursor");
            this.f130347u = arguments.getInt("music_list_has_more");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C38216ad adVar = this.f130343q;
        if (adVar != null && adVar.f90279b != null) {
            ((AbstractC17250a) view.findViewById(R.id.eiz)).mo27298a(false);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.eiv);
            ((ViewGroup) view.findViewById(R.id.eiu)).setVisibility(0);
            C34577e.m70596a(remoteImageView, this.f130343q.f90279b.f90298a, new C24202c<AbstractC24457f>() {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.C57221p.C572221 */

                static {
                    Covode.recordClassIndex(67127);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                    AbstractC24457f fVar2 = fVar;
                    double width = (double) fVar2.getWidth();
                    double height = (double) fVar2.getHeight();
                    Double.isNaN(width);
                    Double.isNaN(height);
                    double a = (double) C34728n.m70946a(21.0d);
                    Double.isNaN(a);
                    ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = (int) ((width / height) * a);
                    layoutParams.height = (int) a;
                    remoteImageView.setLayoutParams(layoutParams);
                }
            });
        }
    }

    /* renamed from: a */
    public static C57221p m103754a(String str, String str2, String str3, int i, boolean z, String str4, int i2, C33935b<String, Object> bVar) {
        C57221p pVar = new C57221p();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", str2);
        bundle.putString("music_class_enter_from", str3);
        bundle.putBoolean("music_class_is_hot", z);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putString("music_class_enter_method", str4);
        bundle.putInt("music_class_level", i2);
        if (bVar != null) {
            bundle.putSerializable("music_model_list", (Serializable) ((List) bVar.mo60174a("list_data")));
            bundle.putInt("music_list_cursor", ((Integer) bVar.mo60174a("list_cursor")).intValue());
            bundle.putInt("music_list_has_more", ((Integer) bVar.mo60174a("list_hasmore")).intValue());
        }
        pVar.setArguments(bundle);
        return pVar;
    }
}
