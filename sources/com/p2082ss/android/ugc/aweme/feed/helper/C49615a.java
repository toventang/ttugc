package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.a */
public final class C49615a {

    /* renamed from: a */
    public static boolean f114164a;

    /* renamed from: b */
    public static final C49615a f114165b = new C49615a();

    /* renamed from: c */
    private static String f114166c;

    /* renamed from: d */
    private static Long f114167d;

    private C49615a() {
    }

    static {
        Covode.recordClassIndex(58462);
    }

    /* renamed from: a */
    public static final void m93036a() {
        f114167d = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static boolean m93041a(Aweme aweme) {
        return !C89219l.m154714a((Object) f114166c, (Object) aweme.getAid());
    }

    /* renamed from: a */
    public static final void m93038a(Aweme aweme, String str) {
        Long l = f114167d;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            f114167d = null;
            if (aweme != null && str != null) {
                m93040a(aweme, str, "audio_play_duration", C89041ag.m154412a(C89387v.m154943a("duration", String.valueOf(currentTimeMillis))));
            }
        }
    }

    /* renamed from: a */
    public static void m93039a(Aweme aweme, String str, String str2) {
        m93036a();
        m93040a(aweme, str, "audio_play", C89041ag.m154412a(C89387v.m154943a("enter_method", str2)));
        f114166c = aweme.getAid();
    }

    /* renamed from: a */
    public static final void m93037a(Aweme aweme, Aweme aweme2, String str, String str2) {
        String str3;
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(aweme.getRequestId())).mo59983a("status", C49616b.m93042a(C49510c.m92748b())).mo59983a("play_order", C49510c.m92751e().toMobString()).mo59983a("from_group_id", aweme.getFromGroupId());
        Music music = aweme.getMusic();
        Object obj = "";
        if (music == null || (str3 = String.valueOf(music.getId())) == null) {
            str3 = obj;
        }
        C33744d a2 = a.mo59983a("from_music_id", str3).mo59983a("to_group_id", aweme2.getFromGroupId());
        Music music2 = aweme2.getMusic();
        if (music2 != null) {
            obj = Long.valueOf(music2.getId());
        }
        C39162r.m79460a(str2, a2.mo59982a("to_music_id", obj).f79943a);
    }

    /* renamed from: a */
    public static final void m93040a(Aweme aweme, String str, String str2, Map<String, String> map) {
        String str3;
        C33744d a = new C33744d().mo59983a("enter_from", str);
        User author = aweme.getAuthor();
        Long l = null;
        if (author != null) {
            str3 = author.getUid();
        } else {
            str3 = null;
        }
        C33744d a2 = a.mo59983a("author_id", str3).mo59983a("group_id", aweme.getAid());
        Music music = aweme.getMusic();
        if (music != null) {
            l = Long.valueOf(music.getId());
        }
        C39162r.m79460a(str2, a2.mo59983a("music_id", String.valueOf(l)).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(aweme.getRequestId())).mo59983a("status", C49616b.m93042a(C49510c.m92748b())).mo59983a("play_order", C49510c.m92751e().toMobString()).mo59986a(map).f79943a);
    }
}
