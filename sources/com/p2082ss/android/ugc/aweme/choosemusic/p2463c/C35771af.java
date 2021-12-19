package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35915q;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35991u;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38216ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60328b;
import com.p2082ss.android.ugc.aweme.p2759di.CommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69128d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.af */
public final class C35771af extends AbstractC35794i implements AbstractC39063h.AbstractC39067a, AbstractC39063h.AbstractC39067a {

    /* renamed from: m */
    public String f84421m;

    /* renamed from: n */
    public String f84422n;

    /* renamed from: o */
    public String f84423o;

    /* renamed from: p */
    C38216ad f84424p;

    /* renamed from: q */
    private boolean f84425q;

    /* renamed from: r */
    private String f84426r;

    /* renamed from: s */
    private int f84427s;

    /* renamed from: t */
    private List<MusicModel> f84428t;

    /* renamed from: u */
    private int f84429u;

    /* renamed from: v */
    private int f84430v;

    /* renamed from: w */
    private int f84431w;

    /* renamed from: y */
    private String f84432y;

    /* renamed from: z */
    private boolean f84433z;

    static {
        Covode.recordClassIndex(43010);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "music_list";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62842b(Object obj) {
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
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: o */
    public final int mo62834o() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: p */
    public final String mo62835p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: q */
    public final int mo62836q() {
        return R.layout.a19;
    }

    /* renamed from: u */
    public final void mo62845u() {
        if (this.f84492d != null) {
            this.f84492d.mo63023a(this.f84421m, this.f84427s, this.f84431w);
        }
    }

    /* renamed from: v */
    public final void mo62846v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: t */
    public final void mo62844t() {
        ShareInfo n = mo62888n();
        if (n != null) {
            C68863ah.f154027a.mo109400a(getActivity(), n, this.f84421m, "", new C69692g() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35771af.C357732 */

                static {
                    Covode.recordClassIndex(43012);
                }

                @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
                /* renamed from: a */
                public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                    super.mo60846a(hVar, sharePackage, context);
                    if (C69128d.m122236a(hVar)) {
                        C35936b.m73318a(C35771af.this.f84423o, C35771af.this.f84421m, C35771af.this.f84422n, hVar.mo61919c());
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b, com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g
                /* renamed from: a */
                public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                    super.mo60844a(bVar, z, sharePackage, context);
                    C35936b.m73318a(C35771af.this.f84423o, C35771af.this.f84421m, C35771af.this.f84422n, bVar.mo109548a());
                }
            });
            String str = this.f84423o;
            String str2 = this.f84421m;
            String str3 = this.f84422n;
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", str).mo59983a("playlist_id", str2).mo59983a("playlist_name", str3);
            C39162r.m79460a("click_share_playlist_button", dVar.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62843m() {
        if (this.f84492d != null && this.f84493e != null) {
            C33935b bVar = (C33935b) this.f84493e.mo60192a("music_list");
            if ((this.f84494j instanceof AbstractC35981m) && ((AbstractC35981m) this.f84494j).f84959j) {
                if (this.f84494j != null) {
                    this.f84494j.mo60175a();
                }
                C35899b bVar2 = this.f84492d;
                String str = this.f84421m;
                int intValue = ((Integer) bVar.mo60174a("list_cursor")).intValue();
                int i = this.f84427s;
                int i2 = this.f84431w;
                if (!bVar2.f84733f) {
                    bVar2.f84733f = true;
                    ChooseMusicApi.m72939a(str, intValue, 16, i, i2).mo5534a(new C35915q(bVar2), C1731i.f5564c, null);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        if (this.f84428t == null) {
            this.f84492d.mo63023a(this.f84421m, this.f84427s, this.f84431w);
            return;
        }
        this.f84493e.mo60191a("refresh_status_music_list", (Object) 0);
        C33935b bVar = new C33935b();
        bVar.mo60173a("list_cursor", Integer.valueOf(this.f84429u)).mo60173a("list_hasmore", Integer.valueOf(this.f84430v)).mo60173a("action_type", 1).mo60173a("list_data", this.f84428t);
        this.f84493e.mo60191a("music_list", bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: b */
    public final AbstractC33936c mo62831b(View view) {
        C35991u uVar;
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            uVar = new C35991u(getContext(), view, this, R.string.anc, this, this, this.f84496l);
        } else if (this.f84428t != null) {
            uVar = new C35991u(getContext(), view, this, this, this, this.f84496l);
        } else {
            uVar = new C35991u(getContext(), view, this, R.string.db2, this, this, this.f84496l);
        }
        if (this.f84427s != 2) {
            uVar.f84950a.setTitle(this.f84422n);
        } else if (uVar.f84953d != null) {
            uVar.f84953d.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uVar.f84952c.getLayoutParams();
        layoutParams.height = -1;
        uVar.f84952c.setLayoutParams(layoutParams);
        uVar.mo63144a(this.f84425q);
        uVar.mo63146b(this.f84433z);
        uVar.mo63143a(this);
        uVar.f84985p = this.f84432y;
        C35754b bVar = new C35754b(this.f84423o, this.f84422n, this.f84426r, C35936b.f84812a);
        bVar.mo62804a(this.f84421m);
        uVar.mo63142a(bVar);
        uVar.mo63135a(new C35775ah(this));
        return uVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f84421m = arguments.getString("music_class_id");
            this.f84422n = arguments.getString("music_class_name");
            this.f84423o = arguments.getString("music_class_enter_from");
            this.f84425q = arguments.getBoolean("music_class_is_hot", false);
            this.f84426r = arguments.getString("music_class_enter_method");
            this.f84427s = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.f84428t = (List) serializable;
            }
            this.f84429u = arguments.getInt("music_list_cursor");
            this.f84430v = arguments.getInt("music_list_has_more");
            this.f84431w = arguments.getInt("sound_page_scene", 0);
            this.f84432y = arguments.getString("track_id");
            this.f84433z = arguments.getBoolean("is_external");
        }
        this.f84424p = CommerceServiceImpl.m83407a().mo60110a(this.f84421m);
        String str = this.f84426r;
        String str2 = C35936b.f84812a;
        String str3 = this.f84421m;
        String str4 = this.f84422n;
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_from", "change_music_page_detail").mo59983a("enter_method", str).mo59983a("previous_page", str2).mo59983a("category_id", str3).mo59983a("category_name", str4);
        C39162r.m79460a("playlist_page_show", dVar.f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C38216ad adVar = this.f84424p;
        if (adVar != null && adVar.f90279b != null && C60328b.m110043a() != 0) {
            ((AbstractC17250a) view.findViewById(R.id.eiz)).mo27298a(false);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eiu);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.eiv);
            viewGroup.setVisibility(0);
            C34577e.m70596a(remoteImageView, this.f84424p.f90279b.f90298a, new C24202c<AbstractC24457f>() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35771af.C357721 */

                static {
                    Covode.recordClassIndex(43011);
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
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "change_music_page");
                    hashMap.put("category_name", C35771af.this.f84422n);
                    C39162r.m79460a("show_ad_sticker", hashMap);
                }
            });
            viewGroup.setOnClickListener(new View$OnClickListenerC35774ag(this));
        }
    }

    /* renamed from: a */
    public static C35771af m72985a(String str, String str2, String str3, int i, boolean z, String str4, int i2, C33935b<String, Object> bVar, int i3, String str5, boolean z2) {
        C35771af afVar = new C35771af();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", str2);
        bundle.putString("music_class_enter_from", str3);
        bundle.putBoolean("music_class_is_hot", z);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putString("music_class_enter_method", str4);
        bundle.putInt("music_class_level", i2);
        bundle.putInt("sound_page_scene", i3);
        if (bVar != null) {
            bundle.putSerializable("music_model_list", (Serializable) ((List) bVar.mo60174a("list_data")));
            bundle.putInt("music_list_cursor", ((Integer) bVar.mo60174a("list_cursor")).intValue());
            bundle.putInt("music_list_has_more", ((Integer) bVar.mo60174a("list_hasmore")).intValue());
        }
        bundle.putString("track_id", str5);
        bundle.putBoolean("is_external", z2);
        afVar.setArguments(bundle);
        return afVar;
    }
}
