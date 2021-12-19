package com.p2082ss.android.ugc.trill.share.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.C33854u;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.C49925a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.share.base.e */
public final class C85177e {

    /* renamed from: a */
    public static final C85177e f190591a = new C85177e();

    private C85177e() {
    }

    static {
        Covode.recordClassIndex(99221);
    }

    /* renamed from: a */
    private static boolean m146462a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m146465b() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean a = m146462a();
        C58029j.f132256h = a;
        return a;
    }

    /* renamed from: a */
    public static boolean m146463a(Context context) {
        C89219l.m154721d(context, "");
        if (!C80720e.m139939e()) {
            new C79459a(context).mo123050a(R.string.feu).mo123053a();
            return false;
        } else if (C80720e.m139940f() >= 20971520) {
            return true;
        } else {
            new C79459a(context).mo123050a(R.string.fev).mo123053a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m146464a(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        if (C68909c.m121606b()) {
            if (aweme == null || !C68909c.m121605a() || !C68909c.m121607b("download")) {
                new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.buk)).mo123053a();
            } else {
                new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.bul)).mo123053a();
            }
            return false;
        } else if (!m146465b()) {
            new C79459a(context).mo123050a(R.string.dcq).mo123053a();
            C33854u.m69291a(C33854u.EnumC33855a.NETWORK, aweme);
            return false;
        } else if (m146463a(context)) {
            return true;
        } else {
            C33854u.m69291a(C33854u.EnumC33855a.SDCARD, aweme);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m146466b(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        if (C68909c.m121606b()) {
            if (aweme == null || !C68909c.m121605a() || !C68909c.m121607b("download")) {
                new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.buk)).mo123053a();
            } else {
                new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.bul)).mo123053a();
            }
            return false;
        } else if (!C49925a.m93731a(context, aweme)) {
            C33854u.m69291a(C33854u.EnumC33855a.AUDITING, aweme);
            return false;
        } else if (aweme == null || aweme.getVideo() == null || aweme.getAuthor() == null) {
            C33854u.m69291a(C33854u.EnumC33855a.AWEME, aweme);
            return false;
        } else if (!m146463a(context)) {
            C33854u.m69291a(C33854u.EnumC33855a.SDCARD, aweme);
            return false;
        } else if (m146465b()) {
            return true;
        } else {
            new C79459a(context).mo123050a(R.string.dcq).mo123053a();
            C33854u.m69291a(C33854u.EnumC33855a.NETWORK, aweme);
            return false;
        }
    }
}
