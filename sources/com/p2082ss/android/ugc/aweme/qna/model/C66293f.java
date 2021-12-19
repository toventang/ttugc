package com.p2082ss.android.ugc.aweme.qna.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.C66004a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.C66517d;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.f */
public class C66293f {

    /* renamed from: i */
    public static final C66294a f149042i = new C66294a((byte) 0);

    /* renamed from: g */
    public final int f149043g;

    /* renamed from: h */
    public final String f149044h;

    static {
        Covode.recordClassIndex(77802);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.model.f$a */
    public static final class C66294a {
        static {
            Covode.recordClassIndex(77803);
        }

        private C66294a() {
        }

        public /* synthetic */ C66294a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m117965a(User user) {
            if (user == null) {
                return "";
            }
            String a = C80580in.m139677a(user, false);
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: b */
        private static String m117968b(User user) {
            UrlModel avatarThumb;
            List<String> urlList;
            if (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || !(!urlList.isEmpty())) {
                return null;
            }
            return urlList.get(0);
        }

        /* renamed from: a */
        private static String m117966a(Integer num) {
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            String a = C53437b.m98615a((long) intValue);
            return C17867d.m33078a().getResources().getQuantityString(R.plurals.gz, intValue, a);
        }

        /* renamed from: a */
        private static C66358d m117964a(User user, Long l) {
            String str;
            String str2 = null;
            if (user != null) {
                str = user.getUid();
                str2 = user.getSecUid();
            } else {
                str = null;
            }
            return new C66358d(str, str2, l);
        }

        /* renamed from: a */
        private static C66299k m117963a(String str, Aweme aweme) {
            Video video;
            UrlModel cover;
            List<String> urlList;
            if (aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty())) {
                return null;
            }
            return new C66299k(str, aweme.getAid(), urlList.get(0));
        }

        /* renamed from: a */
        public static C66296h m117962a(C66504c cVar, boolean z) {
            String string;
            List list;
            List<User> inviterList;
            Integer totalInviterCount;
            C89219l.m154721d(cVar, "");
            Context a = C17867d.m33078a();
            String a2 = m117965a(cVar.getCreator());
            boolean z2 = false;
            if (z) {
                string = a.getString(R.string.f2b);
            } else {
                string = a.getString(R.string.f3j, a2);
            }
            C89219l.m154716b(string, "");
            Long id = cVar.getId();
            ArrayList arrayList = null;
            String valueOf = id != null ? String.valueOf(id.longValue()) : null;
            C66358d a3 = m117964a(cVar.getCreator(), cVar.getId());
            C66299k a4 = m117963a(String.valueOf(cVar.getId()), cVar.getVideo());
            String content = cVar.getContent();
            String a5 = m117966a(cVar.getAnswerCount());
            if (z) {
                C66517d inviteInfo = cVar.getInviteInfo();
                if (!(inviteInfo == null || (totalInviterCount = inviteInfo.getTotalInviterCount()) == null)) {
                    int intValue = totalInviterCount.intValue();
                    List<User> inviterList2 = inviteInfo.getInviterList();
                    if (inviterList2 != null) {
                        int size = intValue - inviterList2.size();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < size; i++) {
                            User user = new User();
                            user.setAvatarThumb(new UrlModel());
                            arrayList2.add(user);
                        }
                        list = C89070n.m154572d((Collection) inviterList2, (Iterable) arrayList2);
                    }
                }
                list = null;
            } else {
                User creator = cVar.getCreator();
                if (creator != null) {
                    list = C89070n.m154516a(creator);
                }
                list = null;
            }
            Integer collectStatus = cVar.getCollectStatus();
            if (collectStatus != null && collectStatus.intValue() == 1) {
                z2 = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z2);
            C66517d inviteInfo2 = cVar.getInviteInfo();
            if (!(inviteInfo2 == null || (inviterList = inviteInfo2.getInviterList()) == null)) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = inviterList.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    if (uid != null) {
                        arrayList3.add(uid);
                    }
                }
                arrayList = arrayList3;
            }
            return new C66296h(2, valueOf, a3, a4, string, content, a5, list, null, valueOf2, z, arrayList, 2048);
        }

        /* renamed from: a */
        private static List<C66299k> m117967a(String str, List<? extends Aweme> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    C66299k a = m117963a(str, (Aweme) it.next());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public static C66293f m117960a(C66004a aVar, String str, boolean z) {
            String str2;
            String str3;
            String str4;
            boolean z2;
            C89219l.m154721d(aVar, "");
            User user = aVar.f148587c;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            boolean equals = TextUtils.equals(str2, g.getCurUserId());
            String valueOf = String.valueOf(aVar.f148585a);
            C66358d a = m117964a(aVar.f148587c, (Long) null);
            String a2 = m117965a(aVar.f148587c);
            if (str == null) {
                str3 = aVar.f148586b;
            } else {
                str3 = str;
            }
            String b = m117968b(aVar.f148587c);
            String b2 = m117968b(aVar.f148588d);
            String a3 = m117965a(aVar.f148588d);
            List<Aweme> list = aVar.f148589e;
            if (list == null || !(!list.isEmpty())) {
                str4 = null;
            } else {
                str4 = " · " + C80566ib.m139651a(C17867d.m33078a(), list.get(0).getCreateTime() * 1000);
            }
            C66292e eVar = new C66292e(b2, a3, str4, m117964a(aVar.f148588d, (Long) null), m117967a(String.valueOf(aVar.f148585a), aVar.f148589e));
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new C66290c(valueOf, a, a2, str3, b, eVar, new C66298j(z2, z, !equals));
        }

        /* renamed from: a */
        public static C66295g m117961a(C66504c cVar, String str, boolean z) {
            String str2;
            String str3;
            String str4;
            boolean z2;
            C89219l.m154721d(cVar, "");
            User creator = cVar.getCreator();
            String str5 = null;
            if (creator != null) {
                str2 = creator.getUid();
            } else {
                str2 = null;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            boolean equals = TextUtils.equals(str2, g.getCurUserId());
            Long id = cVar.getId();
            if (id != null) {
                str3 = String.valueOf(id.longValue());
            } else {
                str3 = null;
            }
            C66358d a = m117964a(cVar.getCreator(), (Long) null);
            C66299k a2 = m117963a(String.valueOf(cVar.getId()), cVar.getVideo());
            String a3 = m117965a(cVar.getCreator());
            if (str == null) {
                str4 = cVar.getContent();
            } else {
                str4 = str;
            }
            String a4 = m117966a(cVar.getAnswerCount());
            String b = m117968b(cVar.getCreator());
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C66298j jVar = new C66298j(z2, z, !equals);
            String questionType = cVar.getQuestionType();
            Long createTime = cVar.getCreateTime();
            if (createTime != null) {
                str5 = " · " + C80566ib.m139651a(C17867d.m33078a(), createTime.longValue() * 1000);
            }
            return new C66295g(str3, a, a2, a3, str4, a4, b, jVar, questionType, str5);
        }
    }

    public C66293f(int i, String str) {
        this.f149043g = i;
        this.f149044h = str;
    }
}
