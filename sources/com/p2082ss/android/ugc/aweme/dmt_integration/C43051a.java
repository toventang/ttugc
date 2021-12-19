package com.p2082ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.common.p2631c.AbstractC39090b;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.EditVideoSegmentDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.ImportVideoInfoDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer;
import com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a.C50654c;
import com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a.C50681g;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.mvtheme.C61289e;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33483b;
import com.p2082ss.android.ugc.aweme.p2361az.AbstractC34399a;
import com.p2082ss.android.ugc.aweme.p2690cr.C40330b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f;
import com.p2082ss.android.ugc.aweme.p4242x.C81662a;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f;
import com.p2082ss.android.ugc.aweme.port.internal.C63282i;
import com.p2082ss.android.ugc.aweme.port.internal.C63298n;
import com.p2082ss.android.ugc.aweme.port.internal.C63299o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63173ag;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63188an;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63214bc;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63228bl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63229bm;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63260r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63267x;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63250k;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.property.C65460eo;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65617g;
import com.p2082ss.android.ugc.aweme.publish.p3624h.C65640e;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.services.AndroidAssetServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.ImportVideoServiceImpl;
import com.p2082ss.android.ugc.aweme.services.InternalRecordServiceImpl;
import com.p2082ss.android.ugc.aweme.services.download.AVDownloadServiceImpl;
import com.p2082ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p2082ss.android.ugc.aweme.servicimpl.C67896ae;
import com.p2082ss.android.ugc.aweme.servicimpl.C67904af;
import com.p2082ss.android.ugc.aweme.servicimpl.C67939v;
import com.p2082ss.android.ugc.aweme.servicimpl.C67941x;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71795r;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.story.C76686d;
import com.p2082ss.android.ugc.aweme.story.base.C76627e;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78393a;
import com.p2082ss.android.ugc.aweme.tools.music.C78728b;
import com.p2082ss.android.ugc.aweme.tools.music.C78734c;
import com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f;
import com.p2082ss.android.ugc.aweme.watermark.C81496i;
import com.p2082ss.android.ugc.tools.p4353i.C84531a;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.a */
public final class C43051a implements AbstractC63263u {

    /* renamed from: A */
    private final AbstractC89244h f100365A = C89250i.m154773a((AbstractC89171a) C43075w.f100416a);

    /* renamed from: B */
    private final AbstractC89244h f100366B = C89250i.m154773a((AbstractC89171a) C43061i.f100402a);

    /* renamed from: a */
    public final Application f100367a;

    /* renamed from: b */
    private final AbstractC89244h f100368b = C89250i.m154773a((AbstractC89171a) C43069q.f100410a);

    /* renamed from: c */
    private final AbstractC89244h f100369c = C89250i.m154773a((AbstractC89171a) C43068p.f100409a);

    /* renamed from: d */
    private final AbstractC89244h f100370d = C89250i.m154773a((AbstractC89171a) C43060h.f100401a);

    /* renamed from: e */
    private final AbstractC89244h f100371e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C43057e.f100398a);

    /* renamed from: f */
    private final AbstractC89244h f100372f = C89250i.m154773a((AbstractC89171a) C43056d.f100397a);

    /* renamed from: g */
    private final AbstractC89244h f100373g = C89250i.m154773a((AbstractC89171a) C43062j.f100403a);

    /* renamed from: h */
    private final AbstractC89244h f100374h = C89250i.m154773a((AbstractC89171a) C43073u.f100414a);

    /* renamed from: i */
    private final AbstractC89244h f100375i = C89250i.m154773a((AbstractC89171a) C43072t.f100413a);

    /* renamed from: j */
    private final AbstractC89244h f100376j = C89250i.m154773a((AbstractC89171a) C43064l.f100405a);

    /* renamed from: k */
    private final AbstractC89244h f100377k = C89250i.m154773a((AbstractC89171a) C43077y.f100418a);

    /* renamed from: l */
    private final AbstractC89244h f100378l = C89250i.m154773a((AbstractC89171a) C43059g.f100400a);

    /* renamed from: m */
    private final AbstractC89244h f100379m = C89250i.m154773a((AbstractC89171a) C43054b.f100395a);

    /* renamed from: n */
    private final AbstractC89244h f100380n = C89250i.m154773a((AbstractC89171a) C43071s.f100412a);

    /* renamed from: o */
    private final AbstractC89244h f100381o = C89250i.m154773a((AbstractC89171a) C43065m.f100406a);

    /* renamed from: p */
    private final AbstractC89244h f100382p = C89250i.m154773a((AbstractC89171a) C43074v.f100415a);

    /* renamed from: q */
    private final AbstractC89244h f100383q = C89250i.m154773a((AbstractC89171a) C43070r.f100411a);

    /* renamed from: r */
    private final AbstractC89244h f100384r = C89250i.m154773a((AbstractC89171a) C43053aa.f100394a);

    /* renamed from: s */
    private final AbstractC89244h f100385s = C89250i.m154773a((AbstractC89171a) new C43078z(this));

    /* renamed from: t */
    private final AbstractC89244h f100386t = C89250i.m154773a((AbstractC89171a) C43063k.f100404a);

    /* renamed from: u */
    private final AbstractC89244h f100387u = C89250i.m154773a((AbstractC89171a) C43067o.f100408a);

    /* renamed from: v */
    private final AbstractC89244h f100388v = C89250i.m154773a((AbstractC89171a) C43055c.f100396a);

    /* renamed from: w */
    private final AbstractC89244h f100389w = C89250i.m154773a((AbstractC89171a) C43058f.f100399a);

    /* renamed from: x */
    private final AbstractC89244h f100390x = C89250i.m154773a((AbstractC89171a) C43052a.f100393a);

    /* renamed from: y */
    private final AbstractC89244h f100391y = C89250i.m154773a((AbstractC89171a) C43066n.f100407a);

    /* renamed from: z */
    private final AbstractC89244h f100392z = C89250i.m154773a((AbstractC89171a) C43076x.f100417a);

    static {
        Covode.recordClassIndex(51204);
    }

    /* renamed from: R */
    private final IFoundationAVServiceProxy m85888R() {
        return (IFoundationAVServiceProxy) this.f100368b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: I */
    public final AbstractC63190ap mo73263I() {
        return (AbstractC63190ap) this.f100391y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: J */
    public final AbstractC63228bl mo73264J() {
        return (AbstractC63228bl) this.f100392z.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: K */
    public final AbstractC63223bh mo73265K() {
        return (AbstractC63223bh) this.f100365A.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: L */
    public final AbstractC33483b mo73266L() {
        return (AbstractC33483b) this.f100366B.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: b */
    public final AbstractC63264v mo73274b() {
        return (AbstractC63264v) this.f100369c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: c */
    public final AbstractC63275c mo73275c() {
        return (AbstractC63275c) this.f100370d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: d */
    public final AbstractC63274b mo73276d() {
        return (AbstractC63274b) this.f100371e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: e */
    public final AVPreferences mo73277e() {
        return (AVPreferences) this.f100372f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: f */
    public final AbstractC63278f mo73278f() {
        return (AbstractC63278f) this.f100373g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: g */
    public final AbstractC40392f mo73279g() {
        return (AbstractC40392f) this.f100374h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: h */
    public final IVideoConfigService mo73280h() {
        return (IVideoConfigService) this.f100375i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: i */
    public final IVideoConfigService mo73281i() {
        return (IVideoConfigService) this.f100376j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: j */
    public final AbstractC63229bm mo73282j() {
        return (AbstractC63229bm) this.f100377k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: k */
    public final AbstractC39090b mo73283k() {
        return (AbstractC39090b) this.f100378l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: l */
    public final AbstractC66810d mo73284l() {
        return (AbstractC66810d) this.f100380n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: m */
    public final AbstractC34399a mo73285m() {
        return (AbstractC34399a) this.f100381o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: n */
    public final AbstractC77267a mo73286n() {
        return (AbstractC77267a) this.f100382p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: o */
    public final AbstractC65617g mo73287o() {
        return (AbstractC65617g) this.f100383q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: p */
    public final AbstractC81493f mo73288p() {
        return (AbstractC81493f) this.f100384r.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: q */
    public final C65460eo mo73289q() {
        return (C65460eo) this.f100385s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: r */
    public final AbstractC50651a mo73290r() {
        return (AbstractC50651a) this.f100386t.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: s */
    public final AbstractC63257p mo73291s() {
        return (AbstractC63257p) this.f100388v.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: a */
    public final void mo73273a() {
        C63238c.m114595e();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: v */
    public final void mo73294v() {
        C63238c.m114594d();
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$aa */
    static final class C43053aa extends AbstractC89220m implements AbstractC89171a<C81496i> {

        /* renamed from: a */
        public static final C43053aa f100394a = new C43053aa();

        static {
            Covode.recordClassIndex(51206);
        }

        C43053aa() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C81496i invoke() {
            return new C81496i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$b */
    static final class C43054b extends AbstractC89220m implements AbstractC89171a<AndroidAssetServiceImpl> {

        /* renamed from: a */
        public static final C43054b f100395a = new C43054b();

        static {
            Covode.recordClassIndex(51207);
        }

        C43054b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AndroidAssetServiceImpl invoke() {
            return new AndroidAssetServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$c */
    static final class C43055c extends AbstractC89220m implements AbstractC89171a<C78734c> {

        /* renamed from: a */
        public static final C43055c f100396a = new C43055c();

        static {
            Covode.recordClassIndex(51208);
        }

        C43055c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78734c invoke() {
            return new C78734c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$e */
    static final class C43057e extends AbstractC89220m implements AbstractC89171a<C81662a> {

        /* renamed from: a */
        public static final C43057e f100398a = new C43057e();

        static {
            Covode.recordClassIndex(51210);
        }

        C43057e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C81662a invoke() {
            return new C81662a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$g */
    static final class C43059g extends AbstractC89220m implements AbstractC89171a<AVDownloadServiceImpl> {

        /* renamed from: a */
        public static final C43059g f100400a = new C43059g();

        static {
            Covode.recordClassIndex(51212);
        }

        C43059g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVDownloadServiceImpl invoke() {
            return new AVDownloadServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$h */
    static final class C43060h extends AbstractC89220m implements AbstractC89171a<C78393a> {

        /* renamed from: a */
        public static final C43060h f100401a = new C43060h();

        static {
            Covode.recordClassIndex(51213);
        }

        C43060h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78393a invoke() {
            return new C78393a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$i */
    static final class C43061i extends AbstractC89220m implements AbstractC89171a<C71795r> {

        /* renamed from: a */
        public static final C43061i f100402a = new C43061i();

        static {
            Covode.recordClassIndex(51214);
        }

        C43061i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71795r invoke() {
            return new C71795r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$j */
    static final class C43062j extends AbstractC89220m implements AbstractC89171a<C43097o> {

        /* renamed from: a */
        public static final C43062j f100403a = new C43062j();

        static {
            Covode.recordClassIndex(51215);
        }

        C43062j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43097o invoke() {
            return new C43097o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$k */
    static final class C43063k extends AbstractC89220m implements AbstractC89171a<C50654c> {

        /* renamed from: a */
        public static final C43063k f100404a = new C43063k();

        static {
            Covode.recordClassIndex(51216);
        }

        C43063k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50654c invoke() {
            return new C50654c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$l */
    static final class C43064l extends AbstractC89220m implements AbstractC89171a<C63282i> {

        /* renamed from: a */
        public static final C43064l f100405a = new C43064l();

        static {
            Covode.recordClassIndex(51217);
        }

        C43064l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63282i invoke() {
            return new C63282i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$m */
    static final class C43065m extends AbstractC89220m implements AbstractC89171a<ImportVideoServiceImpl> {

        /* renamed from: a */
        public static final C43065m f100406a = new C43065m();

        static {
            Covode.recordClassIndex(51218);
        }

        C43065m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImportVideoServiceImpl invoke() {
            return new ImportVideoServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$n */
    static final class C43066n extends AbstractC89220m implements AbstractC89171a<C67939v> {

        /* renamed from: a */
        public static final C43066n f100407a = new C43066n();

        static {
            Covode.recordClassIndex(51219);
        }

        C43066n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67939v invoke() {
            return new C67939v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$o */
    static final class C43067o extends AbstractC89220m implements AbstractC89171a<C50681g> {

        /* renamed from: a */
        public static final C43067o f100408a = new C43067o();

        static {
            Covode.recordClassIndex(51220);
        }

        C43067o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50681g invoke() {
            return new C50681g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$p */
    static final class C43068p extends AbstractC89220m implements AbstractC89171a<C67941x> {

        /* renamed from: a */
        public static final C43068p f100409a = new C43068p();

        static {
            Covode.recordClassIndex(51221);
        }

        C43068p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67941x invoke() {
            return new C67941x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$r */
    static final class C43070r extends AbstractC89220m implements AbstractC89171a<C65640e> {

        /* renamed from: a */
        public static final C43070r f100411a = new C43070r();

        static {
            Covode.recordClassIndex(51223);
        }

        C43070r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65640e invoke() {
            return new C65640e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$s */
    static final class C43071s extends AbstractC89220m implements AbstractC89171a<InternalRecordServiceImpl> {

        /* renamed from: a */
        public static final C43071s f100412a = new C43071s();

        static {
            Covode.recordClassIndex(51224);
        }

        C43071s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InternalRecordServiceImpl invoke() {
            return new InternalRecordServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$t */
    static final class C43072t extends AbstractC89220m implements AbstractC89171a<C63298n> {

        /* renamed from: a */
        public static final C43072t f100413a = new C43072t();

        static {
            Covode.recordClassIndex(51225);
        }

        C43072t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63298n invoke() {
            return new C63298n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$v */
    static final class C43074v extends AbstractC89220m implements AbstractC89171a<C76686d> {

        /* renamed from: a */
        public static final C43074v f100415a = new C43074v();

        static {
            Covode.recordClassIndex(51227);
        }

        C43074v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76686d invoke() {
            return new C76686d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$w */
    static final class C43075w extends AbstractC89220m implements AbstractC89171a<C67896ae> {

        /* renamed from: a */
        public static final C43075w f100416a = new C43075w();

        static {
            Covode.recordClassIndex(51228);
        }

        C43075w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67896ae invoke() {
            return new C67896ae();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$x */
    static final class C43076x extends AbstractC89220m implements AbstractC89171a<C67904af> {

        /* renamed from: a */
        public static final C43076x f100417a = new C43076x();

        static {
            Covode.recordClassIndex(51229);
        }

        C43076x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67904af invoke() {
            return new C67904af();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$y */
    static final class C43077y extends AbstractC89220m implements AbstractC89171a<C63299o> {

        /* renamed from: a */
        public static final C43077y f100418a = new C43077y();

        static {
            Covode.recordClassIndex(51230);
        }

        C43077y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63299o invoke() {
            return new C63299o();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: t */
    public final AbstractC63192ar mo73292t() {
        return new C78728b();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: u */
    public final void mo73293u() {
        C63238c.m114590a(C71815es.m126788a());
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$q */
    static final class C43069q extends AbstractC89220m implements AbstractC89171a<IAVServiceProxy> {

        /* renamed from: a */
        public static final C43069q f100410a = new C43069q();

        static {
            Covode.recordClassIndex(51222);
        }

        C43069q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVServiceProxy invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            if (createIAVServiceProxybyMonsterPlugin != null) {
                return createIAVServiceProxybyMonsterPlugin;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$u */
    static final class C43073u extends AbstractC89220m implements AbstractC89171a<C40330b> {

        /* renamed from: a */
        public static final C43073u f100414a = new C43073u();

        static {
            Covode.recordClassIndex(51226);
        }

        C43073u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40330b invoke() {
            C40330b bVar = new C40330b();
            bVar.mo69468a(new AVStorageManagerImpl());
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$z */
    static final class C43078z extends AbstractC89220m implements AbstractC89171a<C65460eo> {

        /* renamed from: a */
        final /* synthetic */ C43051a f100419a;

        static {
            Covode.recordClassIndex(51231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43078z(C43051a aVar) {
            super(0);
            this.f100419a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65460eo invoke() {
            return new C65460eo(this.f100419a.f100367a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: A */
    public final AbstractC63269z mo73255A() {
        AbstractC63269z accountService = m85888R().getAccountService();
        C89219l.m154716b(accountService, "");
        return accountService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: B */
    public final AbstractC63260r mo73256B() {
        AbstractC63260r bridgeService = m85888R().getBridgeService();
        C89219l.m154716b(bridgeService, "");
        return bridgeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: C */
    public final AbstractC63196au mo73257C() {
        AbstractC63196au networkService = m85888R().getNetworkService();
        C89219l.m154716b(networkService, "");
        return networkService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: D */
    public final AbstractC63214bc mo73258D() {
        AbstractC63214bc iStickerPropService = m85888R().getIStickerPropService();
        C89219l.m154716b(iStickerPropService, "");
        return iStickerPropService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: E */
    public final AbstractC63225bj mo73259E() {
        AbstractC63225bj uiService = m85888R().getUiService();
        C89219l.m154716b(uiService, "");
        return uiService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: F */
    public final AbstractC63227bk mo73260F() {
        AbstractC63227bk unlockStickerService = m85888R().unlockStickerService();
        C89219l.m154716b(unlockStickerService, "");
        return unlockStickerService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: G */
    public final C27910f mo73261G() {
        return (C27910f) this.f100389w.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: H */
    public final C27910f mo73262H() {
        return (C27910f) this.f100390x.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: O */
    public final boolean mo73269O() {
        C63250k kVar = C63250k.C63252a.f143622a;
        kVar.mo101729a();
        if (kVar.f143615c == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: Q */
    public final AbstractC63188an mo73271Q() {
        AbstractC63188an localHashTagService = m85888R().getLocalHashTagService();
        C89219l.m154716b(localHashTagService, "");
        return localHashTagService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: w */
    public final AbstractC63259q mo73295w() {
        AbstractC63259q applicationService = m85888R().getApplicationService();
        C89219l.m154716b(applicationService, "");
        return applicationService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: x */
    public final AbstractC63173ag mo73296x() {
        AbstractC63173ag challengeService = m85888R().getChallengeService();
        C89219l.m154716b(challengeService, "");
        return challengeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: y */
    public final AbstractC63267x mo73297y() {
        AbstractC63267x regionService = m85888R().getRegionService();
        C89219l.m154716b(regionService, "");
        return regionService;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: z */
    public final AbstractC63261s mo73298z() {
        AbstractC63261s commerceService = m85888R().getCommerceService();
        C89219l.m154716b(commerceService, "");
        return commerceService;
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$d */
    static final class C43056d extends AbstractC89220m implements AbstractC89171a<AVPreferences> {

        /* renamed from: a */
        public static final C43056d f100397a = new C43056d();

        static {
            Covode.recordClassIndex(51209);
        }

        C43056d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVPreferences invoke() {
            C14401a aVar = new C14401a();
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            return aVar.mo23215a(application, AVPreferences.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: M */
    public final long mo73267M() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getAVAppContextManager().getVersionCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: N */
    public final long mo73268N() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getAVAppContextManager().getUpdateVersionCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: P */
    public final String mo73270P() {
        IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
        C89219l.m154716b(createIAVSettingServicebyMonsterPlugin, "");
        String appLanguage = createIAVSettingServicebyMonsterPlugin.getAppLanguage();
        C89219l.m154716b(appLanguage, "");
        return appLanguage;
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$a */
    static final class C43052a extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C43052a f100393a = new C43052a();

        static {
            Covode.recordClassIndex(51205);
        }

        C43052a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            C27917g gVar = new C27917g();
            gVar.f65564d = true;
            return gVar.mo46681a((Type) MultiEditVideoSegmentRecordData.class, (Object) new MultiEditVideoSegmentRecordDataDeserializer()).mo46681a((Type) MvNetFileBean.class, (Object) new MvNetFileBeanDeserializer()).mo46681a((Type) Integer.TYPE, (Object) new C84531a()).mo46682b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$f */
    static final class C43058f extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C43058f f100399a = new C43058f();

        static {
            Covode.recordClassIndex(51211);
        }

        C43058f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            C27917g gVar = new C27917g();
            gVar.f65564d = true;
            return gVar.mo46681a((Type) MultiEditVideoSegmentRecordData.class, (Object) new MultiEditVideoSegmentRecordDataDeserializer()).mo46681a((Type) EditVideoSegment.class, (Object) new EditVideoSegmentDeserializer()).mo46681a((Type) ImportVideoInfo.class, (Object) new ImportVideoInfoDeserializer()).mo46681a((Type) MultiEditVideoRecordData.class, (Object) new MultiEditVideoRecordDataDeserializer()).mo46681a((Type) C61288d.class, (Object) new MvCreateVideoDataDeserializer()).mo46681a((Type) EditPreviewInfo.class, (Object) new EditPreviewInfoDeserializer()).mo46681a((Type) AVUploadSaveModel.class, (Object) new AVUploadSaveModelDeserializer()).mo46681a((Type) C61289e.class, (Object) new MvSourceItemInfoDeserializer()).mo46681a((Type) C75439a.class, (Object) new BackgroundVideoDeserializer()).mo46681a((Type) Integer.TYPE, (Object) new C84531a()).mo46681a((Type) TextStickerTextPair.class, (Object) new TextStickerTextPairDeserializer()).mo46682b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u
    /* renamed from: a */
    public final AbstractC50651a mo73272a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "story-filter")) {
            return C76627e.f171965b.mo120334a();
        }
        return mo73290r();
    }

    public C43051a(Application application) {
        C89219l.m154721d(application, "");
        this.f100367a = application;
    }
}
