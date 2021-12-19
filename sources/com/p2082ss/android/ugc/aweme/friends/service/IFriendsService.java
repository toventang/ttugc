package com.p2082ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46927fd;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51479c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService */
public interface IFriendsService {

    /* renamed from: b */
    public static final C51637a f118969b = C51637a.f118970a;

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$b */
    public interface AbstractC51638b {
        static {
            Covode.recordClassIndex(60986);
        }

        /* renamed from: a */
        void mo87344a();

        /* renamed from: b */
        boolean mo87345b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$c */
    public interface AbstractC51639c {
        static {
            Covode.recordClassIndex(60987);
        }

        /* renamed from: a */
        void mo87346a();

        /* renamed from: a */
        void mo87347a(Fragment fragment);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$d */
    public interface AbstractC51640d {
        static {
            Covode.recordClassIndex(60988);
        }

        /* renamed from: a */
        C89378p<Boolean, Long> mo87019a(EnumC66622f fVar);

        /* renamed from: a */
        void mo87020a(EnumC66622f fVar, C89378p<Boolean, Long> pVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$e */
    public interface AbstractC51641e {
        static {
            Covode.recordClassIndex(60989);
        }

        /* renamed from: a */
        void mo87348a();

        /* renamed from: b */
        void mo87349b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$f */
    public interface AbstractC51642f {
        static {
            Covode.recordClassIndex(60990);
        }

        /* renamed from: a */
        void mo87350a();

        /* renamed from: b */
        void mo87351b();
    }

    static {
        Covode.recordClassIndex(60984);
    }

    /* renamed from: a */
    int mo87293a(String str);

    /* renamed from: a */
    Intent mo87294a(Context context, int i, int i2, String str, String str2);

    /* renamed from: a */
    C46927fd mo87295a(int i);

    /* renamed from: a */
    AbstractC51539b mo87296a(ActivityC0945e eVar);

    /* renamed from: a */
    AbstractC51540c mo87297a(Fragment fragment);

    /* renamed from: a */
    AbstractC51755x mo87298a(Context context);

    /* renamed from: a */
    AbstractC51756y mo87299a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2);

    /* renamed from: a */
    AbstractC88403ab<CheckMatchedFriendsResponse> mo87300a();

    /* renamed from: a */
    AbstractC88979t<FriendList<Friend>> mo87301a(String str, int i);

    /* renamed from: a */
    C89378p<String, HashMap<String, Object>> mo87302a(String str, C89378p<String, ? extends HashMap<String, Object>> pVar);

    /* renamed from: a */
    void mo87303a(int i, String str, ActivityC0945e eVar);

    /* renamed from: a */
    void mo87304a(int i, String str, String str2, Context context);

    /* renamed from: a */
    void mo87305a(Activity activity, AbstractC51735f fVar);

    /* renamed from: a */
    void mo87306a(C46927fd fdVar, String str, String str2, Context context);

    /* renamed from: a */
    void mo87307a(AbstractC51499g gVar);

    /* renamed from: a */
    void mo87308a(String str, boolean z);

    /* renamed from: a */
    boolean mo87309a(Activity activity);

    /* renamed from: a */
    boolean mo87310a(User user);

    /* renamed from: a */
    boolean mo87311a(boolean z);

    /* renamed from: b */
    AbstractC51538a mo87312b(Context context);

    /* renamed from: b */
    IContactService mo87313b();

    /* renamed from: b */
    AbstractC88979t<UploadContactsResult> mo87314b(int i);

    /* renamed from: b */
    void mo87315b(AbstractC51499g gVar);

    /* renamed from: b */
    void mo87316b(String str);

    /* renamed from: b */
    void mo87317b(boolean z);

    /* renamed from: b */
    boolean mo87318b(Activity activity);

    /* renamed from: c */
    AbstractC88979t<List<Friend>> mo87319c(int i);

    /* renamed from: c */
    Class<? extends AbstractC79495a> mo87320c();

    /* renamed from: c */
    void mo87321c(boolean z);

    /* renamed from: d */
    AbstractC51479c mo87322d();

    /* renamed from: d */
    void mo87323d(int i);

    /* renamed from: d */
    void mo87324d(boolean z);

    /* renamed from: e */
    boolean mo87325e();

    /* renamed from: f */
    Class<? extends AbstractC79495a> mo87326f();

    /* renamed from: g */
    AbstractC51485d mo87327g();

    /* renamed from: h */
    long mo87328h();

    /* renamed from: i */
    AbstractC51754w mo87329i();

    /* renamed from: j */
    AbstractC51638b mo87330j();

    /* renamed from: k */
    AbstractC51640d mo87331k();

    /* renamed from: l */
    boolean mo87332l();

    /* renamed from: m */
    boolean mo87333m();

    /* renamed from: n */
    boolean mo87334n();

    /* renamed from: o */
    int mo87335o();

    /* renamed from: p */
    AbstractC51779c mo87336p();

    /* renamed from: q */
    void mo87337q();

    /* renamed from: r */
    boolean mo87338r();

    /* renamed from: s */
    AbstractC51649b mo87339s();

    /* renamed from: t */
    void mo87340t();

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFriendsService$a */
    public static final class C51637a {

        /* renamed from: a */
        static final /* synthetic */ C51637a f118970a = new C51637a();

        private C51637a() {
        }

        static {
            Covode.recordClassIndex(60985);
        }
    }
}
