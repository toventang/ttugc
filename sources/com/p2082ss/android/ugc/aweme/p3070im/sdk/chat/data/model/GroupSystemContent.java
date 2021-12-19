package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent */
public final class GroupSystemContent extends SystemContent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: tf */
    private static final Typeface f123450tf = C17301b.m32033a().mo27611a(C17303d.f41573g);
    @AbstractC27891c(mo46611a = "group_name")
    private String groupName;
    @AbstractC27891c(mo46611a = "max_display_object_users")
    private int maxObjectUsers;
    @AbstractC27891c(mo46611a = "max_display_subject_users")
    private int maxSubjectUsers;
    @AbstractC27891c(mo46611a = "object_users")
    private List<? extends IMUser> objectUsers;
    @AbstractC27891c(mo46611a = "subject_users")
    private List<? extends IMUser> subjectUsers;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63440);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMaxObjectUsers() {
        return this.maxObjectUsers;
    }

    public final int getMaxSubjectUsers() {
        return this.maxSubjectUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getObjectUsers() {
        return this.objectUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getSubjectUsers() {
        return this.subjectUsers;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String spannableStringBuilder = getNoticeText(false).toString();
        C89219l.m154716b(spannableStringBuilder, "");
        return spannableStringBuilder;
    }

    static {
        Covode.recordClassIndex(63439);
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setMaxObjectUsers(int i) {
        this.maxObjectUsers = i;
    }

    public final void setMaxSubjectUsers(int i) {
        this.maxSubjectUsers = i;
    }

    public final void setObjectUsers(List<? extends IMUser> list) {
        this.objectUsers = list;
    }

    public final void setSubjectUsers(List<? extends IMUser> list) {
        this.subjectUsers = list;
    }

    public final SpannableStringBuilder getNoticeText(boolean z) {
        IMUser iMUser;
        switch (this.type) {
            case 103101:
                return formatTips$default(this, R.string.c7b, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103102:
                return formatTips(R.string.c7k, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, 1, z));
            case 103103:
                return formatTips$default(this, R.string.c7l, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103104:
                return formatTips$default(this, R.string.c7n, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103105:
                return formatTips(R.string.c7c, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, this.maxObjectUsers, z));
            case 103106:
                SpannableStringBuilder systemUsersSpans = getSystemUsersSpans(this.subjectUsers, 1, z);
                String[] strArr = new String[2];
                strArr[0] = "[[0]]";
                String str = this.groupName;
                if (str == null) {
                    str = "";
                }
                strArr[1] = str;
                return formatTips$default(this, R.string.c7j, systemUsersSpans, strArr, null, 8, null);
            case 103107:
                List<? extends IMUser> list = this.subjectUsers;
                if (list == null || (iMUser = (IMUser) C89070n.m154583g((List) list)) == null || !(!C89219l.m154714a((Object) iMUser.getUid(), (Object) C55197c.m100919b()))) {
                    return new SpannableStringBuilder(C17867d.m33078a().getString(R.string.c7i));
                }
                return new SpannableStringBuilder(C17867d.m33078a().getString(R.string.c7h, iMUser.getDisplayName()));
            default:
                return new SpannableStringBuilder(C17867d.m33078a().getString(R.string.c8j));
        }
    }

    private final SpannableStringBuilder getSystemUsersSpans(List<? extends IMUser> list, int i, boolean z) {
        int i2 = i;
        if (i2 <= 0) {
            i2 = 1;
        }
        int c = C0643b.m2378c(C17867d.m33078a(), R.color.c4);
        C55357e.C55358a.m101168a();
        List<IMUser> a = C55357e.m101164a(list);
        C17191a.C17192a aVar = new C17191a.C17192a();
        int c2 = C89271h.m154772c(a.size(), i2);
        int i3 = 2;
        if (a.size() - i2 == 1 && a.size() >= 2) {
            c2 = a.size() - 2;
        }
        List<IMUser> subList = a.subList(0, c2);
        int i4 = 0;
        for (T t : subList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            String displayName = t2.getDisplayName();
            if ((displayName == null || displayName.length() == 0) && (displayName = t2.getUid()) == null) {
                displayName = "";
            }
            if (z) {
                C53701d.C53702a a2 = C53701d.m98971a(c, t2.getUid(), t2.getSecUid(), false);
                SystemContent.Key key = new SystemContent.Key();
                key.action = 9;
                a2.f123218a = key;
                Object[] objArr = new Object[i3];
                objArr[0] = new C23126b(62);
                objArr[1] = a2;
                List<Object> b = C89070n.m154522b(objArr);
                C89219l.m154721d(displayName, "");
                C89219l.m154721d(b, "");
                int length = aVar.f40973a.length();
                C17191a.C17194c.m31757a(aVar.f40973a, displayName);
                int length2 = aVar.f40973a.length();
                for (Object obj : b) {
                    aVar.f40973a.setSpan(obj, length, length2, 33);
                }
            } else {
                aVar.mo27179b(displayName);
            }
            if (i4 != subList.size() - 1) {
                aVar.mo27177a(C17867d.m33078a().getString(R.string.b94) + ' ');
            }
            i4 = i5;
            i3 = 2;
        }
        if (a.size() <= c2) {
            return aVar.f40973a;
        }
        String string = C17867d.m33078a().getResources().getString(R.string.c8k, "{{%s}}", String.valueOf(a.size() - c2));
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        int a3 = C89361p.m154888a((CharSequence) spannableStringBuilder, "{{%s}}", 0, false, 6);
        SpannableStringBuilder replace = spannableStringBuilder.replace(a3, a3 + 6, (CharSequence) aVar.f40973a);
        C89219l.m154716b(replace, "");
        return replace;
    }

    private final SpannableStringBuilder formatTips(int i, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2) {
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        try {
            spannableStringBuilder3.append((CharSequence) C17867d.m33078a().getString(i, Arrays.copyOf(strArr, strArr.length)));
            int a = C89361p.m154888a((CharSequence) spannableStringBuilder3, "[[0]]", 0, false, 6);
            spannableStringBuilder3.replace(a, a + 5, (CharSequence) spannableStringBuilder);
            if (spannableStringBuilder2 != null) {
                int a2 = C89361p.m154888a((CharSequence) spannableStringBuilder3, "[[1]]", 0, false, 6);
                spannableStringBuilder3.replace(a2, a2 + 5, (CharSequence) spannableStringBuilder2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spannableStringBuilder3;
    }

    static /* synthetic */ SpannableStringBuilder getSystemUsersSpans$default(GroupSystemContent groupSystemContent, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return groupSystemContent.getSystemUsersSpans(list, i, z);
    }

    static /* synthetic */ SpannableStringBuilder formatTips$default(GroupSystemContent groupSystemContent, int i, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            spannableStringBuilder2 = null;
        }
        return groupSystemContent.formatTips(i, spannableStringBuilder, strArr, spannableStringBuilder2);
    }
}
