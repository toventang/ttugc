package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.AbstractC70405a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70465j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br */
public final class C72195br implements AbstractC72263v {

    /* renamed from: h */
    public static final C72196a f161843h = new C72196a((byte) 0);

    /* renamed from: a */
    public ShortVideoContext f161844a;

    /* renamed from: b */
    public List<? extends C69905c> f161845b;

    /* renamed from: c */
    public long f161846c;

    /* renamed from: d */
    public long f161847d;

    /* renamed from: e */
    public final Activity f161848e;

    /* renamed from: f */
    public final long f161849f;

    /* renamed from: g */
    public final long f161850g;

    /* renamed from: i */
    private List<? extends MediaModel> f161851i;

    /* renamed from: j */
    private int f161852j;

    /* renamed from: k */
    private boolean f161853k;

    /* renamed from: l */
    private ProgressDialogC84958b f161854l;

    /* renamed from: m */
    private long f161855m = -1;

    static {
        Covode.recordClassIndex(84860);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br$a */
    public static final class C72196a {
        static {
            Covode.recordClassIndex(84861);
        }

        private C72196a() {
        }

        public /* synthetic */ C72196a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Intent m127388a(Activity activity, ShortVideoContext shortVideoContext, int i, long j) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(shortVideoContext, "");
            Intent intent = new Intent();
            intent.putExtra("extra_start_enter_cut_page", j);
            intent.putExtra("enter_method", shortVideoContext.f155838w);
            intent.putExtra("from_music_detail", C89219l.m154714a((Object) "single_song", (Object) shortVideoContext.f155831p));
            intent.putExtra("creation_id", shortVideoContext.f155830o);
            intent.putExtra("shoot_way", shortVideoContext.f155831p);
            intent.putExtra("shoot_from", shortVideoContext.f155833r);
            intent.putExtra("shout_out_data", shortVideoContext.f155765Z);
            intent.putExtra("extra_stick_point_type", i);
            intent.putExtra("comment_video_model", shortVideoContext.f155825j);
            intent.putExtra("question_answer_video_model", shortVideoContext.f155826k);
            intent.putExtra("share_id", shortVideoContext.f155821f);
            intent.putExtra("channel", shortVideoContext.f155841z);
            intent.putExtra("is_rivate", shortVideoContext.f155749J);
            Workspace workspace = shortVideoContext.f155817b.f155652h;
            C89219l.m154716b(workspace, "");
            if (C69823b.m123388a(workspace.mo110093c(), activity)) {
                Workspace workspace2 = shortVideoContext.f155817b.f155652h;
                C89219l.m154716b(workspace2, "");
                intent.putExtra("path", workspace2.mo110093c());
            }
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            List<AVChallenge> list = a.f156485d;
            if (!C13617h.m24465a(list)) {
                AVChallenge aVChallenge = list.get(0);
                if (!(aVChallenge instanceof Serializable)) {
                    aVChallenge = null;
                }
                intent.putExtra("av_challenge", (Serializable) aVChallenge);
            }
            intent.putExtra("micro_app_info", shortVideoContext.f155796af);
            intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f155766a);
            intent.putExtra("auto_selected_anchor", shortVideoContext.f155787aU);
            intent.putExtra("open_platform_extra", shortVideoContext.f155788aV);
            intent.putExtra("open_platform_client_key", shortVideoContext.f155789aW);
            C77816g.m135933a(intent, C72700q.m128167b(shortVideoContext), EnumC77814e.RECORD, EnumC77814e.CUT);
            if (TextUtils.equals(shortVideoContext.f155837v, "douplus")) {
                intent.putExtra("extra_mention_user_model", shortVideoContext.f155802al);
                intent.putExtra("enter_from", "douplus");
            }
            C70641dm.m124845a(intent, shortVideoContext);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br$b */
    public static final class C72197b implements AbstractC72433g {

        /* renamed from: a */
        final /* synthetic */ C72195br f161856a;

        static {
            Covode.recordClassIndex(84862);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g
        /* renamed from: a */
        public final void mo113365a() {
            this.f161856a.mo114433b();
            this.f161856a.mo114432a(null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72197b(C72195br brVar) {
            this.f161856a = brVar;
        }
    }

    /* renamed from: d */
    private long m127381d() {
        long j = this.f161846c;
        if (j > 60000) {
            return 0;
        }
        return j;
    }

    /* renamed from: e */
    private long m127382e() {
        long j = this.f161847d;
        if (j > 60000) {
            return 0;
        }
        return j;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br$c */
    public static final class C72198c implements AbstractC72433g {

        /* renamed from: a */
        final /* synthetic */ C72195br f161857a;

        /* renamed from: b */
        final /* synthetic */ int f161858b;

        /* renamed from: c */
        final /* synthetic */ StringBuilder f161859c;

        static {
            Covode.recordClassIndex(84863);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br$c$a */
        public static final class C72199a implements AbstractC70443i {

            /* renamed from: a */
            final /* synthetic */ C72198c f161860a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89237d f161861b;

            /* renamed from: c */
            final /* synthetic */ long f161862c;

            static {
                Covode.recordClassIndex(84864);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: a */
            public final void mo110996a() {
                this.f161861b.element = System.currentTimeMillis();
                this.f161860a.f161857a.f161846c = this.f161861b.element - this.f161862c;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: b */
            public final void mo111000b() {
                this.f161860a.f161857a.mo114433b();
                this.f161860a.f161857a.mo114432a(this.f161860a.f161857a.f161845b);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: c */
            public final void mo111002c() {
                this.f161860a.f161857a.mo114433b();
                this.f161860a.f161857a.mo114432a(this.f161860a.f161857a.f161845b);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: a */
            public final void mo110999a(List<? extends C69905c> list) {
                this.f161860a.f161857a.f161845b = list;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: a */
            public final void mo110998a(Exception exc) {
                this.f161860a.f161857a.mo114433b();
                this.f161860a.f161857a.mo114432a(null);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: b */
            public final void mo111001b(Exception exc) {
                this.f161860a.f161857a.mo114433b();
                this.f161860a.f161857a.mo114432a(null);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
            /* renamed from: a */
            public final void mo110997a(C69905c cVar) {
                this.f161860a.f161857a.f161847d = System.currentTimeMillis() - this.f161861b.element;
                this.f161860a.f161857a.mo114433b();
                this.f161860a.f161857a.mo114432a(this.f161860a.f161857a.f161845b);
            }

            C72199a(C72198c cVar, C89233z.C89237d dVar, long j) {
                this.f161860a = cVar;
                this.f161861b = dVar;
                this.f161862c = j;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g
        /* renamed from: a */
        public final void mo113365a() {
            long currentTimeMillis = System.currentTimeMillis();
            C89233z.C89237d dVar = new C89233z.C89237d();
            dVar.element = 0;
            AbstractC70405a a = C70465j.m124298a();
            Context applicationContext = this.f161857a.f161848e.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            a.mo110977a(applicationContext, this.f161858b, this.f161859c.toString(), new C72199a(this, dVar, currentTimeMillis));
        }

        C72198c(C72195br brVar, int i, StringBuilder sb) {
            this.f161857a = brVar;
            this.f161858b = i;
            this.f161859c = sb;
        }
    }

    /* renamed from: b */
    public final void mo114433b() {
        ProgressDialogC84958b bVar;
        ProgressDialogC84958b bVar2 = this.f161854l;
        if (bVar2 != null) {
            Boolean valueOf = Boolean.valueOf(bVar2.isShowing());
            if (valueOf == null) {
                C89219l.m154715b();
            }
            if (valueOf.booleanValue() && (bVar = this.f161854l) != null) {
                bVar.dismiss();
            }
        }
    }

    /* renamed from: c */
    private final void m127380c() {
        C80322d.m139251a("tool_performance_ai_clip", new C84425b().mo129404a("fetch_music", m127381d()).mo129404a("fetch_algorithm", m127382e()).f188764a);
    }

    /* renamed from: f */
    private final void m127383f() {
        Activity activity = this.f161848e;
        if (activity != null && !activity.isFinishing()) {
            Activity activity2 = this.f161848e;
            ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(activity2, activity2.getString(R.string.g1j));
            this.f161854l = b;
            if (b != null) {
                b.setIndeterminate(true);
            }
        }
    }

    /* renamed from: b */
    private final Intent m127379b(List<? extends C69905c> list) {
        if (list != null && !list.isEmpty()) {
            m127380c();
        }
        Activity activity = this.f161848e;
        ShortVideoContext shortVideoContext = this.f161844a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        Intent a = C72196a.m127388a(activity, shortVideoContext, this.f161852j, this.f161855m);
        if (!C84904k.m145909a(list)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic>");
            a.putExtra("extra_stickpoint_music_list", (ArrayList) list);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo114432a(List<? extends C69905c> list) {
        int i;
        if (this.f161844a != null) {
            ShortVideoContext shortVideoContext = this.f161844a;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (shortVideoContext.f155797ag) {
                i = 1002;
            } else {
                i = -1;
            }
            C72724a.m128203a().mo62197a((AbstractC72725b) this.f161848e, (Context) m127379b(list), (Intent) i, (int) ((AbstractC89171a<C89391z>) null));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        ArrayList parcelableArrayListExtra;
        C89219l.m154721d(intent, "");
        if (i == 1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null) {
            this.f161851i = parcelableArrayListExtra;
            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            if (shortVideoContext != null) {
                this.f161844a = shortVideoContext;
                int i2 = 0;
                this.f161852j = intent.getIntExtra("extra_stick_point_type", 0);
                this.f161853k = intent.getBooleanExtra("extra_stickpoint_mode", false);
                this.f161855m = intent.getLongExtra("extra_start_enter_edit_page", -1);
                List<? extends MediaModel> list = this.f161851i;
                if (list == null) {
                    C89219l.m154710a("selectedMediaData");
                }
                C89386u uVar = C72182bp.m127372a(this.f161848e, list, this.f161849f, 3600000);
                boolean booleanValue = ((Boolean) uVar.component1()).booleanValue();
                int intValue = ((Number) uVar.component2()).intValue();
                long longValue = ((Number) uVar.component3()).longValue();
                if (booleanValue) {
                    C59187c.f134693a.mo96693b();
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C59187c.f134693a.mo96692a((MediaModel) list.get(i3));
                    }
                    if (this.f161844a != null) {
                        ShortVideoContext shortVideoContext2 = this.f161844a;
                        if (shortVideoContext2 == null) {
                            C89219l.m154710a("shortVideoContext");
                        }
                        String str = shortVideoContext2.f155831p;
                        ShortVideoContext shortVideoContext3 = this.f161844a;
                        if (shortVideoContext3 == null) {
                            C89219l.m154710a("shortVideoContext");
                        }
                        C70463h.m124286a(str, shortVideoContext3.f155830o);
                    }
                    ShortVideoContext shortVideoContext4 = this.f161844a;
                    if (shortVideoContext4 == null) {
                        C89219l.m154710a("shortVideoContext");
                    }
                    C72200bs.m127399a(shortVideoContext4, list, intValue, (int) longValue);
                    C72200bs.m127400a(list);
                    if (C70455f.f157420d && list.size() > 1) {
                        m127383f();
                        int size2 = list.size();
                        StringBuilder sb = new StringBuilder();
                        for (T t : list) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                C89070n.m154520a();
                            }
                            sb.append(t.f134668h);
                            if (i2 < size2 - 1) {
                                sb.append(",");
                            }
                            i2 = i4;
                        }
                        C72440e.m127813a(list, new C72198c(this, size2, sb));
                    } else if (list.size() <= 1 || !C70455f.f157420d) {
                        mo114432a(null);
                    } else {
                        m127383f();
                        C72440e.m127813a(list, new C72197b(this));
                    }
                }
            }
        }
    }

    public C72195br(Activity activity, long j, long j2) {
        C89219l.m154721d(activity, "");
        this.f161848e = activity;
        this.f161849f = j;
        this.f161850g = j2;
    }
}
