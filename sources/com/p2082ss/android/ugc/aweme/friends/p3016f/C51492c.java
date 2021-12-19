package com.p2082ss.android.ugc.aweme.friends.p3016f;

import android.net.Uri;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.friends.invite.C51542e;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.friends.f.c */
public final class C51492c implements InviteContactFriendsModel.IFetchShareConfigCallback {

    /* renamed from: a */
    final InviteContactFriendsModel f118676a;

    /* renamed from: b */
    private final WeakReference<AbstractC51493a> f118677b;

    /* renamed from: c */
    private C51542e f118678c;

    /* renamed from: com.ss.android.ugc.aweme.friends.f.c$a */
    public interface AbstractC51493a {
        static {
            Covode.recordClassIndex(60758);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.f.c$b */
    public interface AbstractC51494b {
        static {
            Covode.recordClassIndex(60759);
        }

        /* renamed from: a */
        void mo87010a(String str);
    }

    static {
        Covode.recordClassIndex(60757);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback
    public final void onFailed() {
    }

    /* renamed from: a */
    public final void mo87005a() {
        this.f118676a.fetchShareConfig(this);
    }

    /* renamed from: b */
    public final String mo87007b() {
        String str;
        try {
            str = this.f118678c.getUrl();
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (C13627m.m24498a(str)) {
            return "https://m.tiktok.com/invitef/download";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback
    public final void onSuccess(C51542e eVar) {
        this.f118678c = eVar;
        this.f118677b.get();
    }

    /* renamed from: a */
    public final String mo87004a(String str) {
        String str2;
        try {
            String text = this.f118678c.getText();
            String quote = Pattern.quote("%@");
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            return text.replaceFirst(quote, Matcher.quoteReplacement(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return C1764a.m5928a(C51427a.f118503a.getString(R.string.ata), new Object[]{str});
        } catch (Throwable unused) {
            return C51427a.f118503a.getString(R.string.ata);
        }
    }

    public C51492c(InviteContactFriendsModel inviteContactFriendsModel, AbstractC51493a aVar) {
        this.f118676a = inviteContactFriendsModel;
        this.f118677b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo87006a(String str, AbstractC51494b bVar) {
        RunnableC13596e.m24423a(new RunnableC51495d(this, str, bVar));
    }

    /* renamed from: a */
    public static String m95945a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        User curUser = C31575b.m65865g().getCurUser();
        if (C13627m.m24498a(str)) {
            return " ";
        }
        if (z) {
            str5 = "manual";
        } else {
            str5 = "0";
        }
        if (C13627m.m24498a(str2)) {
            str2 = "0";
        }
        try {
            str = Uri.parse(str).buildUpon().appendQueryParameter("user_id", C80580in.m139696i(curUser)).appendQueryParameter("enter_from", str4).appendQueryParameter("invitemode", str3).appendQueryParameter("invitesystem", str5).appendQueryParameter("platform", str2).appendQueryParameter("copytype", "0").build().toString();
            return str;
        } catch (Exception unused) {
            return str;
        }
    }
}
