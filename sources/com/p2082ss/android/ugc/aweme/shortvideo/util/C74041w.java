package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.api.C65508a;
import com.p2082ss.android.ugc.aweme.publish.api.C65509b;
import com.p2082ss.android.ugc.aweme.publish.api.IGetVideoInfoApi;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71916j;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w */
public final class C74041w {

    /* renamed from: a */
    public static final C74041w f166188a = new C74041w();

    private C74041w() {
    }

    static {
        Covode.recordClassIndex(86793);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w$a */
    public static final class C74042a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C74042a f166189a = new C74042a();

        static {
            Covode.recordClassIndex(86794);
        }

        C74042a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_play_circle;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w$b */
    static final class C74043b<T> implements AbstractC88408ag {

        /* renamed from: a */
        public static final C74043b f166190a = new C74043b();

        static {
            Covode.recordClassIndex(86795);
        }

        C74043b() {
        }

        @Override // p4560f.p4561a.AbstractC88408ag
        /* renamed from: a_ */
        public final void mo116431a_(AbstractC88406ae<? super C65509b> aeVar) {
            C89219l.m154721d(aeVar, "");
            aeVar.onSuccess(new C65509b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w$d */
    static final class C74045d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f166195a;

        /* renamed from: b */
        final /* synthetic */ int f166196b;

        /* renamed from: c */
        final /* synthetic */ MentionEditText f166197c;

        /* renamed from: d */
        final /* synthetic */ String f166198d;

        static {
            Covode.recordClassIndex(86797);
        }

        C74045d(int i, int i2, MentionEditText mentionEditText, String str) {
            this.f166195a = i;
            this.f166196b = i2;
            this.f166197c = mentionEditText;
            this.f166198d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C74041w.m130198a(this.f166195a, this.f166196b, this.f166197c);
            MentionEditText mentionEditText = this.f166197c;
            if (mentionEditText != null) {
                mentionEditText.mo116538a("timeout", false, this.f166195a, null, this.f166198d);
            }
        }
    }

    /* renamed from: a */
    public static int m130197a(List<? extends AVTextExtraStruct> list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == 5) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w$c */
    static final class C74044c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f166191a;

        /* renamed from: b */
        final /* synthetic */ int f166192b;

        /* renamed from: c */
        final /* synthetic */ MentionEditText f166193c;

        /* renamed from: d */
        final /* synthetic */ String f166194d;

        static {
            Covode.recordClassIndex(86796);
        }

        C74044c(int i, int i2, MentionEditText mentionEditText, String str) {
            this.f166191a = i;
            this.f166192b = i2;
            this.f166193c = mentionEditText;
            this.f166194d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C65509b bVar = (C65509b) obj;
            C74041w.m130198a(this.f166191a, this.f166192b, this.f166193c);
            if (bVar.f147732a == 408) {
                MentionEditText mentionEditText = this.f166193c;
                if (mentionEditText != null) {
                    mentionEditText.mo116538a("timeout", false, this.f166191a, null, this.f166194d);
                    return;
                }
                return;
            }
            String str = null;
            if (bVar.f147732a != 0 || bVar.f147734c == null || bVar.f147733b == null) {
                MentionEditText mentionEditText2 = this.f166193c;
                if (mentionEditText2 != null) {
                    C65508a aVar = bVar.f147734c;
                    if (aVar != null) {
                        str = aVar.f147730b;
                    }
                    mentionEditText2.mo116538a(str, false, this.f166191a, null, this.f166194d);
                    return;
                }
                return;
            }
            C65508a aVar2 = bVar.f147734c;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            if (aVar2.f147729a) {
                MentionEditText mentionEditText3 = this.f166193c;
                if (mentionEditText3 != null) {
                    mentionEditText3.mo116538a(bVar.f147734c.f147730b, bVar.f147734c.f147731c, this.f166191a, bVar.f147733b, this.f166194d);
                    return;
                }
                return;
            }
            MentionEditText mentionEditText4 = this.f166193c;
            if (mentionEditText4 != null) {
                C65508a aVar3 = bVar.f147734c;
                if (aVar3 != null) {
                    str = aVar3.f147730b;
                }
                mentionEditText4.mo116538a(str, false, this.f166191a, null, this.f166194d);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m130201a(String str) {
        if (str == null || str.length() == 0 || str.length() < 23 || str.length() > C71916j.m126995a() || !C89361p.m154874b(str, "https://", false) || !C89361p.m154908a((CharSequence) str, (CharSequence) "tiktok", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m130198a(int i, int i2, MentionEditText mentionEditText) {
        if (mentionEditText != null && mentionEditText.f166477s) {
            mentionEditText.setHasUrlTransforming(false);
            Editable text = mentionEditText.getText();
            if (text != null) {
                text.delete(i, i2);
            }
            mentionEditText.setUrlEnd(i);
        }
    }

    /* renamed from: a */
    public static void m130199a(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2) {
        String str2;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel)).mo129406a("enter_method", str).mo129403a("author_is_private", i2);
        if (i != 1) {
            if (i != 2) {
                if (i != 140) {
                    if (i != 143) {
                        str2 = "public";
                        C39162r.m79460a("add_quote_video_finish", a.mo129406a("privacy_status", str2).f188764a);
                    }
                }
            }
            str2 = "friendVisible";
            C39162r.m79460a("add_quote_video_finish", a.mo129406a("privacy_status", str2).f188764a);
        }
        str2 = "private";
        C39162r.m79460a("add_quote_video_finish", a.mo129406a("privacy_status", str2).f188764a);
    }

    /* renamed from: a */
    public static void m130200a(String str, int i, int i2, MentionEditText mentionEditText) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        AbstractC88403ab<C65509b> videoInfoByURL = ((IGetVideoInfoApi) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, IGetVideoInfoApi.class)).getVideoInfoByURL(str);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C74043b bVar = C74043b.f166190a;
        C88466b.m153697a((Object) bVar, "other is null");
        videoInfoByURL.mo142908a(10, timeUnit, C88925a.m154160a(C88946a.f201990b), bVar).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C74044c(i, i2, mentionEditText, str), new C74045d(i, i2, mentionEditText, str));
    }
}
