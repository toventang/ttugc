package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.sticker.p3953c.AbstractC75274a;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4001a.C75991a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C75998a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C76000b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76017a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76020d;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76025d;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.DialogC76024c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter */
public final class UploadPicStickerARPresenter extends AbstractC75614b implements AbstractC33974au, AbstractC75498c, AbstractC75576l, AbstractC75591e {

    /* renamed from: v */
    public static boolean f170658v;

    /* renamed from: w */
    public static final C75977a f170659w = new C75977a((byte) 0);

    /* renamed from: A */
    private final List<C75938j> f170660A;

    /* renamed from: B */
    private final AbstractC89244h f170661B;

    /* renamed from: C */
    private final AbstractC89244h f170662C;

    /* renamed from: D */
    private final AbstractC84919c f170663D;

    /* renamed from: E */
    private final AbstractC76018b f170664E;

    /* renamed from: F */
    private final AbstractC75615a f170665F;

    /* renamed from: G */
    private final AbstractC89172b<List<String>, C89391z> f170666G;

    /* renamed from: H */
    private final AbstractC89187q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> f170667H;

    /* renamed from: I */
    private final AbstractC89183m<List<C75938j>, List<C75938j>, C89391z> f170668I;

    /* renamed from: J */
    private final AbstractC89183m<String, String, C89391z> f170669J;

    /* renamed from: K */
    private final AbstractC89183m<String, C75938j, C89391z> f170670K;

    /* renamed from: L */
    private final AbstractC75655o f170671L;

    /* renamed from: M */
    private final AbstractC89171a<Boolean> f170672M;

    /* renamed from: N */
    private final ArrayList<C75938j> f170673N;

    /* renamed from: O */
    private final AbstractC89171a<C89391z> f170674O;

    /* renamed from: a */
    public Effect f170675a;

    /* renamed from: b */
    public C75998a f170676b;

    /* renamed from: c */
    public C76025d f170677c;

    /* renamed from: d */
    public final ArrayList<String> f170678d;

    /* renamed from: e */
    public String f170679e;

    /* renamed from: f */
    public long f170680f;

    /* renamed from: g */
    public boolean f170681g;

    /* renamed from: h */
    public int f170682h;

    /* renamed from: i */
    public boolean f170683i;

    /* renamed from: j */
    public int f170684j;

    /* renamed from: k */
    public int f170685k;

    /* renamed from: l */
    public boolean f170686l;

    /* renamed from: m */
    public final List<C75998a> f170687m;

    /* renamed from: n */
    public final ActivityC0945e f170688n;

    /* renamed from: o */
    public final AbstractC75274a f170689o;

    /* renamed from: p */
    public final AbstractC75997b f170690p;

    /* renamed from: q */
    public final AbstractC75978b f170691q;

    /* renamed from: r */
    public final AbstractC89183m<Long, String, C89391z> f170692r;

    /* renamed from: s */
    public final C2560h<Boolean> f170693s;

    /* renamed from: t */
    public final AbstractC84430d f170694t;

    /* renamed from: u */
    public final AbstractC75403e f170695u;

    /* renamed from: x */
    private boolean f170696x;

    /* renamed from: y */
    private boolean f170697y;

    /* renamed from: z */
    private C75990a f170698z;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$b */
    public interface AbstractC75978b {
        static {
            Covode.recordClassIndex(88921);
        }

        /* renamed from: a */
        void mo119674a();

        /* renamed from: a */
        void mo119675a(boolean z);
    }

    static {
        Covode.recordClassIndex(88918);
    }

    /* renamed from: j */
    private final AbstractC84918b m133221j() {
        return (AbstractC84918b) this.f170662C.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    /* renamed from: e */
    public final C76011d mo119667e() {
        return (C76011d) this.f170661B.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$a */
    public static final class C75977a {
        static {
            Covode.recordClassIndex(88920);
        }

        private C75977a() {
        }

        public /* synthetic */ C75977a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: b */
    public final boolean mo118933b() {
        return this.f170697y;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        Effect effect;
        String str5 = "";
        C89219l.m154721d(bVar, str5);
        C89219l.m154721d(aVar, str5);
        ActivityC0945e eVar = this.f170688n;
        C89219l.m154721d(eVar, str5);
        C75938j jVar = null;
        String str6 = null;
        String str7 = null;
        jVar = null;
        if ((Build.VERSION.SDK_INT >= 23 ? C0643b.m2367a(eVar, "android.permission.WRITE_EXTERNAL_STORAGE") : 0) != 0) {
            AbstractC89171a<C89391z> aVar2 = this.f170674O;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            ActivityC0945e eVar2 = this.f170688n;
            if (eVar2 != null) {
                str6 = eVar2.getString(R.string.dng);
            }
            new C85052j(eVar2, str6, 0, 1, (byte) 0).mo129996a();
            return;
        }
        Effect effect2 = aVar.f170022a;
        if (effect2 == null || (effect = this.f170675a) == null || !C89219l.m154714a((Object) effect.getEffectId(), (Object) effect2.getEffectId())) {
            m133222k();
        }
        if (this.f170676b == null) {
            this.f170676b = new C75998a();
        }
        C75998a aVar3 = this.f170676b;
        if (aVar3 != null) {
            m133219a(effect2, aVar3);
        }
        C75998a aVar4 = this.f170676b;
        if (aVar4 == null) {
            C89219l.m154715b();
        }
        this.f170684j = aVar4.f170746g.getPl().getFaceCountMin();
        C75998a aVar5 = this.f170676b;
        if (aVar5 == null) {
            C89219l.m154715b();
        }
        this.f170685k = aVar5.f170746g.getPl().getFaceCountMax();
        C75998a aVar6 = this.f170676b;
        if (!(aVar6 == null || (valueOf = Integer.valueOf(aVar6.f170748i)) == null)) {
            if (valueOf.intValue() == 1) {
                C75998a aVar7 = this.f170676b;
                if (aVar7 != null) {
                    str7 = aVar7.f170741b;
                }
                mo119663a(str7);
            } else if (valueOf.intValue() == 3) {
                C75998a aVar8 = this.f170676b;
                if (!(aVar8 == null || (str = aVar8.f170741b) == null)) {
                    C75998a aVar9 = this.f170676b;
                    if (!(aVar9 == null || (str4 = aVar9.f170740a) == null)) {
                        str5 = str4;
                    }
                    C75998a aVar10 = this.f170676b;
                    if (aVar10 == null || (str2 = aVar10.f170749j) == null) {
                        str2 = "GIPHY";
                    }
                    C75998a aVar11 = this.f170676b;
                    if (aVar11 == null || (str3 = aVar11.f170750k) == null) {
                        str3 = "unknown";
                    }
                    jVar = new C75938j(str, 0, 3, str5, str2, str3);
                }
                mo119662a(jVar);
            }
        }
        this.f170675a = effect2;
        Boolean a = m133218a(effect2);
        if (a == null) {
            mo119669g();
        } else if (a.booleanValue()) {
            C76025d dVar = this.f170677c;
            if (dVar != null) {
                dVar.mo119728b();
            }
        } else {
            mo119669g();
        }
    }

    /* renamed from: a */
    public final void mo119664a(List<String> list) {
        C75998a aVar;
        if (!this.f170696x && !list.isEmpty() && (aVar = this.f170676b) != null) {
            if (!aVar.mo119702b().isEmpty()) {
                if (C89047am.m154438a((Object[]) new Integer[]{2, 3, 0}).contains(Integer.valueOf(aVar.f170746g.getPl().getAlbumFilter()))) {
                    C76025d dVar = this.f170677c;
                    if (dVar != null) {
                        dVar.mo119730d();
                    }
                    mo119667e().mo119713a(list, aVar);
                    return;
                }
            }
            C76025d dVar2 = this.f170677c;
            if (dVar2 != null && dVar2.f170813d.mo119684a() == 0) {
                m133223l();
            }
            mo119671i();
        }
    }

    /* renamed from: a */
    public final void mo119663a(String str) {
        String str2;
        AbstractC89172b<List<String>, C89391z> bVar;
        if (C84902i.m145892a(str) && this.f170676b != null) {
            String str3 = "";
            this.f170664E.mo119718a(str == null ? str3 : str);
            AbstractC89183m<String, String, C89391z> mVar = this.f170669J;
            C75998a aVar = this.f170676b;
            if (aVar == null || (str2 = aVar.mo119703c()) == null) {
                str2 = str3;
            }
            if (str != null) {
                str3 = str;
            }
            mVar.invoke(str2, str3);
            if (!(str == null || (bVar = this.f170666G) == null)) {
                bVar.invoke(C89070n.m154516a(str));
            }
            this.f170681g = true;
        }
    }

    /* renamed from: a */
    public final void mo119662a(C75938j jVar) {
        String c;
        String str = null;
        if (jVar != null) {
            str = jVar.f170564b;
        }
        if (C84902i.m145892a(str) && this.f170676b != null) {
            AbstractC76018b bVar = this.f170664E;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            bVar.mo119718a(str);
            AbstractC89183m<String, C75938j, C89391z> mVar = this.f170670K;
            C75998a aVar = this.f170676b;
            if (!(aVar == null || (c = aVar.mo119703c()) == null)) {
                str2 = c;
            }
            if (jVar == null) {
                C89219l.m154715b();
            }
            mVar.invoke(str2, jVar);
            this.f170681g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$c */
    static final class C75979c extends AbstractC89220m implements AbstractC89171a<C759801> {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170700a;

        static {
            Covode.recordClassIndex(88922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75979c(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            super(0);
            this.f170700a = uploadPicStickerARPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C759801 invoke() {
            return new AbstractC84918b(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter.C75979c.C759801 */

                /* renamed from: a */
                final /* synthetic */ C75979c f170701a;

                static {
                    Covode.recordClassIndex(88923);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f170701a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$c$1$a */
                public static final class C75981a implements AbstractC2565m<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ C759801 f170702a;

                    /* renamed from: b */
                    final /* synthetic */ List f170703b;

                    static {
                        Covode.recordClassIndex(88924);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
                    public final /* synthetic */ void onChanged(Boolean bool) {
                        this.f170702a.f170701a.f170700a.mo119666c(this.f170703b);
                        this.f170702a.f170701a.f170700a.f170693s.mo7037a(this);
                    }

                    C75981a(C759801 r1, List list) {
                        this.f170702a = r1;
                        this.f170703b = list;
                    }
                }

                /* renamed from: a */
                private static String m133247a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
                /* renamed from: a */
                public final boolean mo62778a(int i, int i2, Intent intent) {
                    Boolean bool;
                    if (i == 10001 || i == 10004) {
                        AbstractC75403e eVar = this.f170701a.f170700a.f170695u;
                        if (eVar != null) {
                            eVar.mo118949b();
                        }
                        if (intent != null && i2 == -1) {
                            this.f170701a.f170700a.f170683i = false;
                            List<C75938j> a = this.f170701a.f170700a.f170690p.mo119698a(intent);
                            if (a == null) {
                                return false;
                            }
                            String a2 = m133247a(intent, "click_content");
                            if (a2 == null) {
                                a2 = "";
                            }
                            C89219l.m154716b(a2, "");
                            AbstractC84430d dVar = this.f170701a.f170700a.f170694t;
                            if (dVar != null) {
                                Effect effect = this.f170701a.f170700a.f170675a;
                                if (effect != null) {
                                    effect.getEffectId();
                                }
                                a.size();
                                dVar.mo118964a(a2);
                            }
                            C2560h<Boolean> hVar = this.f170701a.f170700a.f170693s;
                            if (hVar != null) {
                                bool = hVar.mo7034a();
                            } else {
                                bool = null;
                            }
                            if (C89219l.m154714a((Object) bool, (Object) false)) {
                                this.f170701a.f170700a.f170693s.mo7036a(this.f170701a.f170700a.f170688n, new C75981a(this, a));
                                return true;
                            }
                            this.f170701a.f170700a.mo119666c(a);
                            return true;
                        }
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$f */
    public static final class C75984f implements AbstractC76019c {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170706a;

        /* renamed from: b */
        final /* synthetic */ View f170707b;

        static {
            Covode.recordClassIndex(88927);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119576a() {
            this.f170706a.mo119670h();
            this.f170706a.f170676b = null;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: b */
        public final void mo119579b() {
            this.f170706a.f170682h = 1;
            this.f170706a.mo119661a(10001);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: c */
        public final void mo119580c() {
            this.f170706a.f170682h = 1;
            this.f170706a.mo119661a(10004);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119578a(List<C75938j> list) {
            C89219l.m154721d(list, "");
            this.f170706a.f170682h = 2;
            this.f170706a.mo119665b(list);
        }

        C75984f(UploadPicStickerARPresenter uploadPicStickerARPresenter, View view) {
            this.f170706a = uploadPicStickerARPresenter;
            this.f170707b = view;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119577a(C75998a aVar, AbstractC76017a aVar2) {
            C75998a aVar3;
            aVar2.mo119696a();
            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.f170706a;
            String str = null;
            if (aVar != null) {
                aVar.f170750k = "media_tray";
                Effect effect = this.f170706a.f170675a;
                if (effect != null) {
                    UploadPicStickerARPresenter.m133219a(effect, aVar);
                }
                aVar3 = aVar;
            } else {
                aVar3 = null;
            }
            uploadPicStickerARPresenter.f170676b = aVar3;
            if (aVar == null || aVar.f170748i != 3) {
                UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.f170706a;
                if (aVar != null) {
                    str = aVar.f170741b;
                }
                uploadPicStickerARPresenter2.mo119663a(str);
            } else {
                String str2 = aVar.f170741b;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                String str4 = aVar.f170740a;
                if (str4 != null) {
                    str3 = str4;
                }
                String str5 = aVar.f170749j;
                if (str5 == null) {
                    str5 = "GIPHY";
                }
                this.f170706a.mo119662a(new C75938j(str2, 0, 3, str3, str5, "media_tray"));
                AbstractC84430d dVar = this.f170706a.f170694t;
                if (dVar != null) {
                    String str6 = aVar.f170740a;
                    String str7 = aVar.f170745f;
                    boolean z = true;
                    if (aVar.f170748i != 1) {
                        z = false;
                    }
                    dVar.mo118963a(new AbstractC84430d.C84431a(str6, str7, "media_tray", z));
                }
            }
            this.f170706a.f170682h = 2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f170697y = false;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            dVar.mo119728b();
        }
        m133222k();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: d */
    public final void mo118935d() {
        this.f170697y = false;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            dVar.mo119728b();
        }
    }

    /* renamed from: i */
    public final void mo119671i() {
        this.f170696x = true;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            dVar.mo119729c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$h */
    static final class C75986h extends AbstractC89220m implements AbstractC89171a<C76011d> {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170710a;

        static {
            Covode.recordClassIndex(88929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75986h(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            super(0);
            this.f170710a = uploadPicStickerARPresenter;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$h$a */
        public static final class C75987a implements AbstractC76020d {

            /* renamed from: a */
            final /* synthetic */ C89233z.C89237d f170711a;

            /* renamed from: b */
            final /* synthetic */ C75986h f170712b;

            static {
                Covode.recordClassIndex(88930);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76020d
            /* renamed from: a */
            public final void mo119677a() {
                this.f170712b.f170710a.mo119668f();
                this.f170712b.f170710a.f170686l = true;
                this.f170712b.f170710a.mo119671i();
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76020d
            /* renamed from: a */
            public final void mo119679a(List<String> list) {
                C89219l.m154721d(list, "");
                if (!list.isEmpty()) {
                    this.f170712b.f170710a.f170678d.addAll(list);
                    this.f170712b.f170710a.mo119664a(list);
                    return;
                }
                this.f170712b.f170710a.mo119671i();
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76020d
            /* renamed from: a */
            public final void mo119678a(C75998a aVar) {
                C76025d dVar;
                String str;
                C76025d dVar2;
                if (this.f170712b.f170710a.f170686l) {
                    this.f170711a.element = SystemClock.uptimeMillis();
                    this.f170712b.f170710a.f170686l = false;
                }
                if (aVar == null) {
                    return;
                }
                if (SystemClock.uptimeMillis() - this.f170711a.element < 5000) {
                    int i = this.f170712b.f170710a.f170684j;
                    int i2 = this.f170712b.f170710a.f170685k;
                    int i3 = aVar.f170744e;
                    if (i <= i3 && i2 >= i3) {
                        Effect effect = this.f170712b.f170710a.f170675a;
                        if (effect == null || (str = effect.getEffectId()) == null) {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(aVar.f170745f) && C89219l.m154714a((Object) aVar.f170745f, (Object) str) && (dVar2 = this.f170712b.f170710a.f170677c) != null) {
                            dVar2.mo119725a(aVar);
                        }
                    } else if (aVar.f170744e > 0) {
                        this.f170712b.f170710a.f170687m.add(aVar);
                    }
                } else {
                    this.f170712b.f170710a.mo119668f();
                    if (aVar.f170744e > 0 && (dVar = this.f170712b.f170710a.f170677c) != null) {
                        dVar.mo119725a(aVar);
                    }
                }
            }

            C75987a(C89233z.C89237d dVar, C75986h hVar) {
                this.f170711a = dVar;
                this.f170712b = hVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76011d invoke() {
            AbstractC75274a aVar = this.f170710a.f170689o;
            Context applicationContext = this.f170710a.f170688n.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            C76011d dVar = new C76011d(aVar, applicationContext);
            C89233z.C89237d dVar2 = new C89233z.C89237d();
            dVar2.element = 0;
            C75987a aVar2 = new C75987a(dVar2, this);
            C89219l.m154721d(aVar2, "");
            dVar.f170789c = aVar2;
            return dVar;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        C75990a aVar;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            dVar.mo119732f();
            if (!this.f170683i && (aVar = this.f170698z) != null && aVar.f170719c) {
                C75991a aVar2 = dVar.f170813d;
                aVar2.mo119693g();
                aVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: c */
    public final void mo118934c() {
        C76025d dVar;
        if (C89219l.m154714a(this.f170671L.mo119294f(), this.f170675a) && (dVar = this.f170677c) != null) {
            this.f170697y = true;
            C76025d.m133305a(dVar, this.f170698z, 2);
            if (C84904k.m145909a(this.f170678d)) {
                mo119667e().mo119714b();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f170678d);
            mo119664a(arrayList);
        }
    }

    /* renamed from: f */
    public final void mo119668f() {
        if (!this.f170687m.isEmpty()) {
            for (C75998a aVar : this.f170687m) {
                C76025d dVar = this.f170677c;
                if (dVar != null) {
                    dVar.mo119725a(aVar);
                }
            }
            this.f170687m.clear();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        m133222k();
        this.f170678d.clear();
        C76011d e = mo119667e();
        int i = Build.VERSION.SDK_INT;
        e.f170787a.quitSafely();
        Handler handler = e.f170788b;
        ActivityC0945e eVar = null;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C76002c.f170764c = true;
        AbstractC84919c cVar = this.f170663D;
        if (cVar == null) {
            ActivityC0945e eVar2 = this.f170688n;
            if (eVar2 instanceof AbstractC84919c) {
                eVar = eVar2;
            }
            cVar = (AbstractC84919c) eVar;
            if (cVar == null) {
                return;
            }
        }
        cVar.mo87534b(m133221j());
    }

    /* renamed from: k */
    private void m133222k() {
        AbstractC89183m<List<C75938j>, List<C75938j>, C89391z> mVar;
        String effectId;
        C76011d e = mo119667e();
        Effect effect = this.f170675a;
        if (!(effect == null || (effectId = effect.getEffectId()) == null)) {
            Long.parseLong(effectId);
        }
        e.mo119715c();
        mo119667e().f170791e = null;
        mo119670h();
        if ((!this.f170660A.isEmpty()) && (mVar = this.f170668I) != null) {
            mVar.invoke(C89070n.m154590j(this.f170660A), C89086z.INSTANCE);
        }
        this.f170696x = false;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            dVar.mo119729c();
            dVar.mo119731e();
        }
        this.f170676b = null;
        this.f170675a = null;
        AbstractC75978b bVar = this.f170691q;
        if (bVar != null) {
            bVar.mo119674a();
        }
    }

    /* renamed from: g */
    public final void mo119669g() {
        Boolean bool;
        C76025d dVar = this.f170677c;
        if (dVar != null) {
            this.f170697y = true;
            C75990a aVar = this.f170698z;
            String str = null;
            if (aVar != null) {
                AbstractC89171a<Boolean> aVar2 = this.f170672M;
                if (aVar2 != null) {
                    bool = aVar2.invoke();
                } else {
                    bool = null;
                }
                aVar.f170722f = bool;
            }
            C75990a aVar3 = this.f170698z;
            Effect effect = this.f170675a;
            if (effect != null) {
                str = effect.getEffectId();
            }
            dVar.mo119724a(aVar3, str);
            if (C84904k.m145909a(this.f170678d)) {
                mo119667e().mo119714b();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f170678d);
            mo119664a(arrayList);
        }
    }

    /* renamed from: h */
    public final void mo119670h() {
        C75998a aVar = this.f170676b;
        if (aVar != null) {
            Integer valueOf = Integer.valueOf(aVar.f170748i);
            String str = "";
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    AbstractC89183m<String, String, C89391z> mVar = this.f170669J;
                    String c = aVar.mo119703c();
                    if (c == null) {
                        c = str;
                    }
                    mVar.invoke(c, str);
                } else if (valueOf.intValue() == 3) {
                    AbstractC89183m<String, C75938j, C89391z> mVar2 = this.f170670K;
                    String c2 = aVar.mo119703c();
                    if (c2 != null) {
                        str = c2;
                    }
                    mVar2.invoke(str, new C75938j("", 0, 3, null, null, null, 56));
                }
            }
        }
    }

    /* renamed from: l */
    private final void m133223l() {
        int i;
        Integer valueOf;
        String c;
        String c2;
        if (!C84904k.m145909a(this.f170678d)) {
            int size = this.f170678d.size();
            ArrayList<C75938j> arrayList = this.f170673N;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            ArrayList arrayList2 = new ArrayList(size + i);
            ArrayList<C75938j> arrayList3 = this.f170673N;
            String str = "";
            if (arrayList3 != null) {
                for (T t : arrayList3) {
                    C75998a aVar = new C75998a(t.f170564b, str, true);
                    aVar.f170748i = 3;
                    aVar.f170740a = t.f170567e;
                    aVar.f170749j = t.f170568f;
                    arrayList2.add(aVar);
                }
            }
            Iterator<String> it = this.f170678d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C89219l.m154716b(next, str);
                arrayList2.add(new C75998a(next, str, true));
            }
            C76025d dVar = this.f170677c;
            if (dVar != null) {
                dVar.mo119727a(arrayList2);
            }
            if (C84904k.m145910b(this.f170673N)) {
                ArrayList<C75938j> arrayList4 = this.f170673N;
                String str2 = null;
                C75938j jVar = arrayList4 != null ? (C75938j) C89070n.m154579f((List) arrayList4) : null;
                C76025d dVar2 = this.f170677c;
                if (dVar2 != null) {
                    if (jVar != null) {
                        str2 = jVar.f170564b;
                    }
                    dVar2.mo119726a(str2);
                }
                this.f170676b = m133220b(jVar);
                if (jVar != null && (valueOf = Integer.valueOf(jVar.f170566d)) != null) {
                    if (valueOf.intValue() == 1) {
                        AbstractC89183m<String, String, C89391z> mVar = this.f170669J;
                        C75998a aVar2 = this.f170676b;
                        if (!(aVar2 == null || (c2 = aVar2.mo119703c()) == null)) {
                            str = c2;
                        }
                        mVar.invoke(str, jVar.f170564b);
                    } else if (valueOf.intValue() == 3) {
                        AbstractC89183m<String, C75938j, C89391z> mVar2 = this.f170670K;
                        C75998a aVar3 = this.f170676b;
                        if (!(aVar3 == null || (c = aVar3.mo119703c()) == null)) {
                            str = c;
                        }
                        mVar2.invoke(str, jVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$g */
    public static final class DialogInterface$OnDismissListenerC75985g implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170708a;

        /* renamed from: b */
        final /* synthetic */ Effect f170709b;

        static {
            Covode.recordClassIndex(88928);
        }

        DialogInterface$OnDismissListenerC75985g(UploadPicStickerARPresenter uploadPicStickerARPresenter, Effect effect) {
            this.f170708a = uploadPicStickerARPresenter;
            this.f170709b = effect;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f170708a.mo119669g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        f170658v = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        if (this.f170668I != null) {
            z = true;
        } else {
            z = false;
        }
        C75990a a = C76002c.m133279a(effect, z);
        this.f170698z = a;
        if (a != null) {
            return a.f170718b;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$d */
    static final class C75982d<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170704a;

        static {
            Covode.recordClassIndex(88925);
        }

        C75982d(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            this.f170704a = uploadPicStickerARPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                C76025d dVar = this.f170704a.f170677c;
                if (dVar != null && dVar.mo119734h()) {
                    DialogC76024c cVar = dVar.f170814e;
                    if (!cVar.isShowing()) {
                        cVar.show();
                        dVar.f170815f = false;
                        return;
                    }
                    return;
                }
                return;
            }
            C76025d dVar2 = this.f170704a.f170677c;
            if (dVar2 != null) {
                dVar2.mo119732f();
            }
        }
    }

    /* renamed from: a */
    private final Boolean m133218a(Effect effect) {
        AbstractC89187q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> qVar = this.f170667H;
        if (qVar == null) {
            return null;
        }
        if (this.f170688n.isFinishing()) {
            return false;
        }
        Handler handler = mo119667e().f170788b;
        if (handler == null) {
            C89219l.m154715b();
        }
        Dialog invoke = qVar.invoke(effect, handler, new DialogInterface$OnDismissListenerC75985g(this, effect));
        if (invoke != null && !this.f170688n.isFinishing()) {
            try {
                invoke.show();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    private final C75998a m133220b(C75938j jVar) {
        Integer num;
        String effectId;
        String effectId2;
        C75998a aVar = null;
        if (jVar != null) {
            num = Integer.valueOf(jVar.f170566d);
        } else {
            num = null;
        }
        String str = "";
        if (num != null) {
            if (num.intValue() == 1) {
                C75998a aVar2 = new C75998a(jVar.f170564b, str, true);
                aVar2.f170748i = 1;
                aVar2.f170749j = jVar.f170568f;
                aVar2.f170750k = jVar.f170569g;
                aVar2.f170740a = jVar.f170567e;
                Effect effect = this.f170675a;
                if (!(effect == null || (effectId2 = effect.getEffectId()) == null)) {
                    str = effectId2;
                }
                aVar2.f170745f = str;
                Effect effect2 = this.f170675a;
                if (effect2 != null) {
                    m133219a(effect2, aVar2);
                }
                return aVar2;
            } else if (num.intValue() == 3) {
                aVar = new C75998a(jVar.f170564b, str, true);
                aVar.f170748i = 3;
                aVar.f170749j = jVar.f170568f;
                aVar.f170750k = jVar.f170569g;
                aVar.f170740a = jVar.f170567e;
                Effect effect3 = this.f170675a;
                if (!(effect3 == null || (effectId = effect3.getEffectId()) == null)) {
                    str = effectId;
                }
                aVar.f170745f = str;
                Effect effect4 = this.f170675a;
                if (effect4 != null) {
                    m133219a(effect4, aVar);
                }
            }
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$e */
    static final class C75983e<T> implements AbstractC1214u<C76000b> {

        /* renamed from: a */
        final /* synthetic */ UploadPicStickerARPresenter f170705a;

        static {
            Covode.recordClassIndex(88926);
        }

        C75983e(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            this.f170705a = uploadPicStickerARPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C76000b bVar) {
            Handler handler;
            String str;
            C76000b bVar2 = bVar;
            if (bVar2 != null) {
                int i = bVar2.f170758a;
                if (i == 30) {
                    this.f170705a.f170680f = System.currentTimeMillis();
                    C76025d dVar = this.f170705a.f170677c;
                    if (dVar != null && (handler = this.f170705a.mo119667e().f170788b) != null && dVar.mo119734h() && !dVar.f170814e.isShowing()) {
                        handler.postDelayed(new C76025d.RunnableC76032e(dVar), 300);
                    }
                    this.f170705a.f170679e = bVar2.f170761d;
                    AbstractC75978b bVar3 = this.f170705a.f170691q;
                    if (bVar3 != null) {
                        bVar3.mo119675a(this.f170705a.f170681g);
                    }
                } else if (i == 31) {
                    if (TextUtils.isEmpty(this.f170705a.f170679e) || C89219l.m154714a((Object) this.f170705a.f170679e, (Object) bVar2.f170761d)) {
                        C76025d dVar2 = this.f170705a.f170677c;
                        if (dVar2 != null) {
                            dVar2.mo119732f();
                        }
                        AbstractC89183m<Long, String, C89391z> mVar = this.f170705a.f170692r;
                        if (mVar != null) {
                            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f170705a.f170680f);
                            Effect effect = this.f170705a.f170675a;
                            if (effect != null) {
                                str = effect.getEffectId();
                            } else {
                                str = null;
                            }
                            mVar.invoke(valueOf, str);
                        }
                        AbstractC75978b bVar4 = this.f170705a.f170691q;
                        if (bVar4 != null) {
                            bVar4.mo119675a(this.f170705a.f170681g);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (r1 != null) goto L_0x00bd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119661a(int r8) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter.mo119661a(int):void");
    }

    /* renamed from: b */
    public final void mo119665b(List<C75938j> list) {
        C75998a aVar = this.f170676b;
        if (aVar != null) {
            this.f170664E.mo119718a("");
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                String str = aVar.mo119703c() + i2;
                C89219l.m154721d(str, "");
                t.f170563a = str;
                i = i2;
            }
            AbstractC89183m<List<C75938j>, List<C75938j>, C89391z> mVar = this.f170668I;
            if (mVar != null) {
                mVar.invoke(C89070n.m154590j(this.f170660A), list);
            }
            AbstractC89172b<List<String>, C89391z> bVar = this.f170666G;
            if (bVar != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f170564b);
                }
                bVar.invoke(arrayList);
            }
            this.f170681g = true;
            List<C75938j> list2 = this.f170660A;
            list2.clear();
            list2.addAll(list);
        }
    }

    /* renamed from: c */
    public final void mo119666c(List<C75938j> list) {
        this.f170676b = m133220b((C75938j) C89070n.m154579f((List) list));
        C75990a aVar = this.f170698z;
        int i = 0;
        if (aVar != null && aVar.f170719c) {
            mo119665b(list);
            C76025d dVar = this.f170677c;
            if (dVar != null) {
                C89219l.m154721d(list, "");
                C75991a aVar2 = dVar.f170813d;
                aVar2.mo119693g();
                C89219l.m154721d(list, "");
                list.size();
                for (C75938j jVar : list) {
                    Iterator<C75998a> it = aVar2.f170727d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C75998a next = it.next();
                        if (C89219l.m154714a((Object) jVar.f170564b, (Object) next.f170741b)) {
                            int size = aVar2.f170728e.size() + 1;
                            aVar2.f170728e.put(next, Integer.valueOf(size));
                            next.f170751l = size;
                            break;
                        }
                    }
                }
                aVar2.notifyDataSetChanged();
                int c = aVar2.mo119689c();
                C75990a aVar3 = dVar.f170810a;
                if (aVar3 != null) {
                    i = aVar3.f170720d;
                }
                if (c >= i) {
                    View j = dVar.mo119736j();
                    if (j != null) {
                        j.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
                View j2 = dVar.mo119736j();
                if (j2 != null) {
                    j2.setAlpha(0.4f);
                }
            }
        } else if (!list.isEmpty()) {
            int i2 = ((C75938j) C89070n.m154579f((List) list)).f170566d;
            if (i2 == 1) {
                String str = ((C75938j) C89070n.m154579f((List) list)).f170564b;
                mo119663a(str);
                C76025d dVar2 = this.f170677c;
                if (dVar2 != null) {
                    dVar2.f170813d.mo119690d();
                    dVar2.mo119726a(str);
                }
            } else if (i2 == 3) {
                C75938j jVar2 = (C75938j) C89070n.m154579f((List) list);
                mo119662a(jVar2);
                C76025d dVar3 = this.f170677c;
                String str2 = null;
                if (dVar3 != null) {
                    dVar3.f170813d.mo119690d();
                    dVar3.mo119726a(jVar2 != null ? jVar2.f170564b : null);
                }
                AbstractC84430d dVar4 = this.f170694t;
                if (dVar4 != null) {
                    C75998a aVar4 = this.f170676b;
                    String str3 = aVar4 != null ? aVar4.f170740a : null;
                    C75998a aVar5 = this.f170676b;
                    if (aVar5 != null) {
                        str2 = aVar5.f170745f;
                    }
                    dVar4.mo118967a(str3, str2, "giphy_tab");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.ea6);
        if (viewStubCompat != null) {
            this.f170677c = new C76025d(viewStubCompat, view.findViewById(R.id.ezn), this.f170671L.mo119288a(), view.findViewById(R.id.bxn), view.findViewById(R.id.b51), view.findViewById(R.id.b52), (ViewGroup) view.findViewById(R.id.cdl), this.f170688n, this.f170694t, new C75984f(this, view));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        Effect effect;
        AbstractC84430d dVar;
        C89219l.m154721d(aVar, "");
        boolean z = true;
        f170658v = true;
        if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE && (effect = this.f170675a) != null) {
            if (this.f170697y) {
                C76025d dVar2 = this.f170677c;
                if (dVar2 != null) {
                    String effectId = effect.getEffectId();
                    if (dVar2.f170811b.getVisibility() == 0 && (dVar = dVar2.f170818i) != null) {
                        if (dVar2.f170812c.getVisibility() != 0) {
                            z = false;
                        }
                        dVar.mo118968a(effectId, z);
                        return;
                    }
                    return;
                }
                return;
            }
            mo119669g();
        }
    }

    /* renamed from: a */
    public static void m133219a(Effect effect, C75998a aVar) {
        String str;
        if (!aVar.mo119700a()) {
            if (effect != null) {
                aVar.mo119699a(effect.getSdkExtra());
            }
            C76002c.f170765d = aVar.f170746g.getPl().getGuide();
            C76002c.f170764c = aVar.f170746g.getPl().getLoading();
        }
        String str2 = null;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        aVar.f170745f = str;
        if (effect != null) {
            str2 = effect.getExtra();
        }
        aVar.mo119701b(str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        boolean z;
        C75990a aVar = this.f170698z;
        if (aVar == null || !aVar.f170719c) {
            z = false;
        } else {
            z = true;
        }
        if ((i == 31 || i == 30) && !z) {
            C1213t<C76000b> a = ((UploadPicStickerMessageModule) C1181ae.m3880a(this.f170688n).mo3983a(UploadPicStickerMessageModule.class)).mo119680a();
            if (str == null) {
                C89219l.m154715b();
            }
            a.postValue(new C76000b(i, i2, i3, str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.b<? super java.util.List<java.lang.String>, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: h.f.a.m<? super java.lang.Long, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: h.f.a.q<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super android.os.Handler, ? super android.content.DialogInterface$OnDismissListener, ? extends android.app.Dialog> */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: h.f.a.m<? super java.lang.String, ? super com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private UploadPicStickerARPresenter(ActivityC0945e eVar, AbstractC84919c cVar, AbstractC75274a aVar, AbstractC76018b bVar, AbstractC75615a aVar2, AbstractC75997b bVar2, AbstractC75978b bVar3, AbstractC89172b<? super List<String>, C89391z> bVar4, AbstractC89183m<? super Long, ? super String, C89391z> mVar, AbstractC89187q<? super Effect, ? super Handler, ? super DialogInterface.OnDismissListener, ? extends Dialog> qVar, AbstractC89183m<? super String, ? super String, C89391z> mVar2, AbstractC89183m<? super String, ? super C75938j, C89391z> mVar3, AbstractC84430d dVar, LiveData<List<String>> liveData, AbstractC75655o oVar, AbstractC75403e eVar2, AbstractC89171a<Boolean> aVar3, ArrayList<C75938j> arrayList, AbstractC89171a<C89391z> aVar4) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(mVar2, "");
        C89219l.m154721d(mVar3, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(oVar, "");
        this.f170688n = eVar;
        this.f170663D = cVar;
        this.f170689o = aVar;
        this.f170664E = bVar;
        this.f170665F = aVar2;
        this.f170690p = bVar2;
        this.f170691q = bVar3;
        this.f170666G = bVar4;
        this.f170692r = mVar;
        this.f170667H = qVar;
        this.f170693s = null;
        this.f170668I = null;
        this.f170669J = mVar2;
        this.f170670K = mVar3;
        this.f170694t = dVar;
        this.f170671L = oVar;
        this.f170695u = eVar2;
        this.f170672M = aVar3;
        this.f170673N = arrayList;
        this.f170674O = aVar4;
        this.f170676b = new C75998a();
        this.f170678d = new ArrayList<>();
        this.f170680f = System.currentTimeMillis();
        this.f170660A = new ArrayList();
        this.f170684j = 2;
        this.f170685k = 5;
        this.f170686l = true;
        this.f170687m = new ArrayList();
        this.f170661B = C89250i.m154773a((AbstractC89171a) new C75986h(this));
        this.f170662C = C89250i.m154773a((AbstractC89171a) new C75979c(this));
        eVar.getLifecycle().mo4012a(this);
        AbstractC1174ac a = C1181ae.m3880a(eVar).mo3983a(UploadPicStickerMessageModule.class);
        C89219l.m154716b(a, "");
        UploadPicStickerMessageModule uploadPicStickerMessageModule = (UploadPicStickerMessageModule) a;
        ((LiveData) uploadPicStickerMessageModule.f170713a.getValue()).observe(eVar, new C75982d(this));
        if (C76002c.f170764c) {
            uploadPicStickerMessageModule.mo119680a().observe(eVar, new C75983e(this));
        }
        liveData.observe(eVar, C759761.f170699a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadPicStickerARPresenter(ActivityC0945e eVar, AbstractC84919c cVar, AbstractC75274a aVar, AbstractC76018b bVar, AbstractC75615a aVar2, AbstractC75997b bVar2, AbstractC75978b bVar3, AbstractC89172b bVar4, AbstractC89183m mVar, AbstractC89187q qVar, AbstractC89183m mVar2, AbstractC89183m mVar3, AbstractC84430d dVar, LiveData liveData, AbstractC75655o oVar, AbstractC75403e eVar2, AbstractC89171a aVar3, ArrayList arrayList, AbstractC89171a aVar4, int i) {
        this(eVar, (i & 2) != 0 ? null : cVar, aVar, bVar, aVar2, bVar2, (i & 64) != 0 ? null : bVar3, (i & 128) != 0 ? null : bVar4, (i & 256) != 0 ? null : mVar, (i & 512) != 0 ? null : qVar, mVar2, mVar3, dVar, liveData, oVar, (131072 & i) != 0 ? null : eVar2, (262144 & i) != 0 ? null : aVar3, (524288 & i) != 0 ? null : arrayList, (i & 1048576) == 0 ? aVar4 : null);
    }
}
