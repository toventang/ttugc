package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55268b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55717a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c */
public class C55273c {

    /* renamed from: a */
    private static C55273c f126381a;

    static {
        Covode.recordClassIndex(65022);
    }

    private C55273c() {
    }

    /* renamed from: a */
    public static void m101049a(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                m101048a(list.get(i));
            }
            C55266b.m101026a().mo92265b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    ContentValues a = m101040a(iMUser, true);
                    if (iMUser.getFriendRecType() == 0 || C55085g.m100757b(iMUser.getUid(), iMUser.getSecUid()) == null) {
                        C55266b.m101026a().mo92262a("SIMPLE_USER", a);
                    } else {
                        C55266b.m101026a().mo92261a("SIMPLE_USER", a, EnumC55268b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
                    }
                }
            }
            C55266b.m101026a().mo92266c();
        }
    }

    /* renamed from: a */
    private static void m101048a(IMUser iMUser) {
        String c = C55717a.m101465c(iMUser.getDisplayName());
        iMUser.setSortWeight(C55718b.m101467b(c));
        iMUser.setInitialLetter(C55718b.m101466a(c));
        try {
            iMUser.setAvatarStr(C55214j.m100958a(iMUser.getAvatarThumb()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m101060g() {
        C55266b.m101026a().mo92267c("SIMPLE_USER");
    }

    /* renamed from: c */
    public static String m101053c() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnumC55268b.COLUMN_FOLLOW_STATUS.key).append(" == 2");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m101059f() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnumC55268b.COLUMN_FOLLOW_STATUS.key).append(" != 0");
        return sb.toString();
    }

    /* renamed from: a */
    public static C55273c m101041a() {
        MethodCollector.m26663i(4720);
        if (f126381a == null) {
            synchronized (C55273c.class) {
                try {
                    if (f126381a == null) {
                        f126381a = new C55273c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4720);
                    throw th;
                }
            }
        }
        C55273c cVar = f126381a;
        MethodCollector.m26664o(4720);
        return cVar;
    }

    /* renamed from: d */
    public static String m101056d() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnumC55268b.COLUMN_FOLLOW_STATUS.key).append(" == 2");
        sb.append(" and ");
        sb.append(EnumC55268b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m101058e() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnumC55268b.COLUMN_FOLLOW_STATUS.key).append(" == 1");
        sb.append(" and ");
        sb.append(EnumC55268b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
        return sb.toString();
    }

    /* renamed from: h */
    public static boolean m101061h() {
        boolean z = true;
        Cursor cursor = null;
        try {
            Cursor b = C55266b.m101026a().mo92264b("select * from SIMPLE_USER");
            if (b != null) {
                if (b.getCount() != 0) {
                    z = false;
                }
                b.close();
                return z;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (0 != 0) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
        return true;
    }

    /* renamed from: j */
    public static int m101063j() {
        Cursor cursor = null;
        try {
            Cursor b = C55266b.m101026a().mo92264b("select * from SIMPLE_USER where " + EnumC55268b.COLUMN_FOLLOW_STATUS.key + " != 0");
            if (b == null) {
                return 0;
            }
            int count = b.getCount();
            try {
                b.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e) {
            C56244a.m102188a(e);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: i */
    public static int m101062i() {
        Cursor cursor = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select * from SIMPLE_USER");
            sb.append(" where ").append(EnumC55268b.COLUMN_FOLLOW_STATUS.key).append(" != -1");
            sb.append(" and ");
            sb.append(EnumC55268b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
            Cursor b = C55266b.m101026a().mo92264b(sb.toString());
            if (b == null) {
                return 0;
            }
            int count = b.getCount();
            try {
                b.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e) {
            C56244a.m102188a(e);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static int m101064k() {
        Cursor cursor = null;
        try {
            String str = "select * from SIMPLE_USER where " + EnumC55268b.COLUMN_FOLLOW_STATUS.key + " == 2";
            CharSequence b = C55197c.m100919b();
            if (!TextUtils.isEmpty(b)) {
                str = str + " and " + EnumC55268b.COLUMN_UID.key + " != " + ((Object) b);
            }
            Cursor b2 = C55266b.m101026a().mo92264b(str);
            if (b2 == null) {
                return 0;
            }
            int count = b2.getCount();
            try {
                b2.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e) {
            C56244a.m102188a(e);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static String m101051b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists SIMPLE_USER (");
        EnumC55268b[] values = EnumC55268b.values();
        for (EnumC55268b bVar : values) {
            sb.append(bVar.key).append(" ").append(bVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser m101043a(java.lang.String r3) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = "select * from SIMPLE_USER where "
            r1.<init>(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55268b.COLUMN_UID     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = " = "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b.m101026a()     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            android.database.Cursor r1 = r0.mo92264b(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x0038
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = m101042a(r1)     // Catch:{ Exception -> 0x0036 }
            r1.close()
            return r0
        L_0x0036:
            r0 = move-exception
            goto L_0x0040
        L_0x0038:
            if (r1 == 0) goto L_0x0050
            goto L_0x004d
        L_0x003b:
            r0 = move-exception
            r1 = r2
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            r1 = r2
        L_0x0040:
            r0.printStackTrace()     // Catch:{ all -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            throw r0
        L_0x004b:
            if (r1 == 0) goto L_0x0050
        L_0x004d:
            r1.close()
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101043a(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser m101050b(java.lang.String r3) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "select * from SIMPLE_USER where "
            r1.<init>(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55268b.COLUMN_SEC_UID     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "='"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.StringBuilder r1 = r0.append(r3)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b.m101026a()     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            android.database.Cursor r1 = r0.mo92264b(r1)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = m101042a(r1)     // Catch:{ Exception -> 0x003c }
            r1.close()
            return r0
        L_0x003c:
            r0 = move-exception
            goto L_0x0046
        L_0x003e:
            if (r1 == 0) goto L_0x0056
            goto L_0x0053
        L_0x0041:
            r0 = move-exception
            r1 = r2
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            r1 = r2
        L_0x0046:
            r0.printStackTrace()     // Catch:{ all -> 0x004a }
            goto L_0x0051
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r0
        L_0x0051:
            if (r1 == 0) goto L_0x0056
        L_0x0053:
            r1.close()
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101050b(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (0 == 0) goto L_0x006e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> m101054c(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101054c(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (0 == 0) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> m101044a(int r5) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
            r2.<init>()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = "select * from SIMPLE_USER limit 0,"
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ Exception -> 0x0033 }
            r0.append(r5)     // Catch:{ Exception -> 0x0033 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b.m101026a()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0033 }
            android.database.Cursor r3 = r1.mo92264b(r0)     // Catch:{ Exception -> 0x0033 }
            if (r3 == 0) goto L_0x0030
        L_0x0022:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = m101042a(r3)     // Catch:{ Exception -> 0x0033 }
            r4.add(r0)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0022
        L_0x0030:
            if (r3 == 0) goto L_0x0044
            goto L_0x0041
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            if (r3 == 0) goto L_0x003e
            r3.close()
        L_0x003e:
            throw r0
        L_0x003f:
            if (r3 == 0) goto L_0x0044
        L_0x0041:
            r3.close()
        L_0x0044:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101044a(int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (0 == 0) goto L_0x0093;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> m101057d(java.util.List<java.lang.String> r5) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101057d(java.util.List):java.util.List");
    }

    /* renamed from: b */
    public static void m101052b(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                m101048a(list.get(i));
            }
            C55266b.m101026a().mo92265b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    iMUser.getUniqueId();
                    iMUser.isMentionEnabled();
                    ContentValues a = m101040a(iMUser, false);
                    if (iMUser.getFriendRecType() == 0 || C55085g.m100757b(iMUser.getUid(), iMUser.getSecUid()) == null) {
                        C55266b.m101026a().mo92262a("SIMPLE_USER", a);
                    } else {
                        C55266b.m101026a().mo92261a("SIMPLE_USER", a, EnumC55268b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
                    }
                }
            }
            C55266b.m101026a().mo92266c();
        }
    }

    /* renamed from: c */
    public static void m101055c(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            C55266b.m101026a().mo92265b();
            for (IMUser iMUser : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC55268b.COLUMN_UID.key, iMUser.getUid());
                contentValues.put(EnumC55268b.COLUMN_SEC_UID.key, iMUser.getSecUid());
                contentValues.put(EnumC55268b.COLUMN_NICK_NAME.key, iMUser.getNickName());
                contentValues.put(EnumC55268b.COLUMN_SIGNATURE.key, iMUser.getSignature());
                contentValues.put(EnumC55268b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
                contentValues.put(EnumC55268b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
                contentValues.put(EnumC55268b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
                contentValues.put(EnumC55268b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
                contentValues.put(EnumC55268b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
                contentValues.put(EnumC55268b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
                contentValues.put(EnumC55268b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
                contentValues.put(EnumC55268b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
                contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
                contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
                contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
                contentValues.put(EnumC55268b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
                contentValues.put(EnumC55268b.COLUMN_USER_FRIEND_REC_TYPE.key, Integer.valueOf(iMUser.getFriendRecType()));
                contentValues.put(EnumC55268b.COLUMN_USER_FOLLOW_TIME.key, Long.valueOf(iMUser.getFollowTime()));
                contentValues.put(EnumC55268b.COLUMN_MENTION_ENABLED.key, Integer.valueOf(!iMUser.isMentionEnabled()));
                contentValues.put(EnumC55268b.COLUMN_QA_INVITE_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getQaInviteBlockStatus()));
                contentValues.put(EnumC55268b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoMentionBlockStatus()));
                contentValues.put(EnumC55268b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoTagBlockStatus()));
                contentValues.put(EnumC55268b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getCommentMentionBlockStatus()));
                contentValues.put(EnumC55268b.COLUMN_FOLLOWER_STATUS.key, Integer.valueOf(iMUser.getFollowerStatus()));
                contentValues.put(EnumC55268b.COLUMN_ACCOUNT_TYPE.key, Integer.valueOf(iMUser.getAccountType()));
                if (iMUser.getFriendRecTime() > 0) {
                    contentValues.put(EnumC55268b.COLUMN_USER_FRIEND_REC_TIME.key, Long.valueOf(iMUser.getFriendRecTime()));
                }
                C55266b.m101026a().mo92261a("SIMPLE_USER", contentValues, EnumC55268b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
            }
            C55266b.m101026a().mo92266c();
        }
    }

    /* renamed from: a */
    private static IMUser m101042a(Cursor cursor) {
        boolean z;
        if (cursor == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_UID.key)));
        iMUser.setSecUid(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_SEC_UID.key)));
        iMUser.setNickName(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_NICK_NAME.key)));
        iMUser.setSignature(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_SIGNATURE.key)));
        iMUser.setAvatarStr(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_AVATAR_THUMB.key)));
        iMUser.setFollowStatus(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_FOLLOW_STATUS.key)));
        iMUser.setUniqueId(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_UNIQUE_ID.key)));
        iMUser.setWeiboVerify(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_WEIBO_VERIFY.key)));
        iMUser.setCustomVerify(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_CUSTOM_VERIFY.key)));
        iMUser.setEnterpriseVerifyReason(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_ENTERPRISE_VERIFY_REASON.key)));
        iMUser.setVerificationType(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_VERIFICATION_TYPE.key)));
        iMUser.setRemarkName(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_REMARK_NAME.key)));
        iMUser.setSortWeight(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_SORT_WEIGHT.key)));
        iMUser.setInitialLetter(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_INITIAL_LETTER.key)));
        iMUser.setShortId(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_SHORT_ID.key)));
        iMUser.setRemarkPinyin(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_REMARK_PINYIN.key)));
        iMUser.setRemarkInitial(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_REMARK_INITIAL.key)));
        iMUser.setNickNamePinyin(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_NICK_NAME_PINYIN.key)));
        iMUser.setNickNameInitial(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_NICK_NAME_INITIAL.key)));
        iMUser.setCommerceUserLevel(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_COMMERCE_USER_LEVEL.key)));
        iMUser.setContactName(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_CONTACT_NAME.key)));
        iMUser.setContactNamePinyin(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_CONTACT_NAME_PINYIN.key)));
        iMUser.setContactNameInitial(cursor.getString(cursor.getColumnIndex(EnumC55268b.COLUMN_CONTACT_NAME_INITIAL.key)));
        iMUser.setShareStatus(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_USER_SHARE_STATUS.key)));
        iMUser.setFriendRecType(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_USER_FRIEND_REC_TYPE.key)));
        iMUser.setFriendRecTime(cursor.getLong(cursor.getColumnIndex(EnumC55268b.COLUMN_USER_FRIEND_REC_TIME.key)));
        iMUser.setFollowTime(cursor.getLong(cursor.getColumnIndex(EnumC55268b.COLUMN_USER_FOLLOW_TIME.key)));
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_BLOCK_STATUS.key)) == 1) {
            z = true;
        } else {
            z = false;
        }
        iMUser.setBlock(z);
        if (cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_MENTION_ENABLED.key)) == 0) {
            z2 = true;
        }
        iMUser.setMentionEnabled(z2);
        iMUser.setQaInviteBlockStatus((long) cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_QA_INVITE_BLOCK_STATUS.key)));
        iMUser.setVideoMentionBlockStatus((long) cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key)));
        iMUser.setVideoTagBlockStatus((long) cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key)));
        iMUser.setCommentMentionBlockStatus((long) cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key)));
        iMUser.setFollowerStatus(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_FOLLOWER_STATUS.key)));
        iMUser.setAccountType(cursor.getInt(cursor.getColumnIndex(EnumC55268b.COLUMN_ACCOUNT_TYPE.key)));
        return iMUser;
    }

    /* renamed from: a */
    private static ContentValues m101040a(IMUser iMUser, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC55268b.COLUMN_UID.key, iMUser.getUid());
        contentValues.put(EnumC55268b.COLUMN_SEC_UID.key, iMUser.getSecUid());
        contentValues.put(EnumC55268b.COLUMN_NICK_NAME.key, iMUser.getNickName());
        contentValues.put(EnumC55268b.COLUMN_SIGNATURE.key, iMUser.getSignature());
        contentValues.put(EnumC55268b.COLUMN_AVATAR_THUMB.key, iMUser.getAvatarStr());
        contentValues.put(EnumC55268b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
        contentValues.put(EnumC55268b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
        contentValues.put(EnumC55268b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
        contentValues.put(EnumC55268b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
        contentValues.put(EnumC55268b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
        contentValues.put(EnumC55268b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
        contentValues.put(EnumC55268b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
        contentValues.put(EnumC55268b.COLUMN_SORT_WEIGHT.key, iMUser.getSortWeight());
        contentValues.put(EnumC55268b.COLUMN_INITIAL_LETTER.key, iMUser.getInitialLetter());
        contentValues.put(EnumC55268b.COLUMN_SHORT_ID.key, iMUser.getShortId());
        contentValues.put(EnumC55268b.COLUMN_REMARK_PINYIN.key, iMUser.getRemarkPinyin());
        contentValues.put(EnumC55268b.COLUMN_REMARK_INITIAL.key, iMUser.getRemarkInitial());
        contentValues.put(EnumC55268b.COLUMN_NICK_NAME_PINYIN.key, iMUser.getNickNamePinyin());
        contentValues.put(EnumC55268b.COLUMN_NICK_NAME_INITIAL.key, iMUser.getNickNameInitial());
        contentValues.put(EnumC55268b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
        contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
        contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
        contentValues.put(EnumC55268b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
        contentValues.put(EnumC55268b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
        contentValues.put(EnumC55268b.COLUMN_USER_FRIEND_REC_TYPE.key, Integer.valueOf(iMUser.getFriendRecType()));
        if (iMUser.getFriendRecTime() > 0) {
            contentValues.put(EnumC55268b.COLUMN_USER_FRIEND_REC_TIME.key, Long.valueOf(iMUser.getFriendRecTime()));
        }
        contentValues.put(EnumC55268b.COLUMN_USER_FOLLOW_TIME.key, Long.valueOf(iMUser.getFollowTime()));
        contentValues.put(EnumC55268b.COLUMN_BLOCK_STATUS.key, Integer.valueOf(iMUser.isBlock() ? 1 : 0));
        if (z) {
            contentValues.put(EnumC55268b.COLUMN_MENTION_ENABLED.key, Integer.valueOf(!iMUser.isMentionEnabled()));
            contentValues.put(EnumC55268b.COLUMN_QA_INVITE_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getQaInviteBlockStatus()));
            contentValues.put(EnumC55268b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoMentionBlockStatus()));
            contentValues.put(EnumC55268b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoTagBlockStatus()));
            contentValues.put(EnumC55268b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getCommentMentionBlockStatus()));
            contentValues.put(EnumC55268b.COLUMN_FOLLOWER_STATUS.key, Integer.valueOf(iMUser.getFollowerStatus()));
        }
        contentValues.put(EnumC55268b.COLUMN_ACCOUNT_TYPE.key, Integer.valueOf(iMUser.getAccountType()));
        return contentValues;
    }

    /* renamed from: a */
    public static List<IMUser> m101046a(List<String> list, int i, int i2) {
        return m101045a("sec_uid", list, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (0 == 0) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> m101045a(java.lang.String r6, java.util.List<java.lang.String> r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101045a(java.lang.String, java.util.List, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (0 == 0) goto L_0x008c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> m101047a(java.util.List<java.lang.String> r5, int r6, int r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101047a(java.util.List, int, int, java.lang.String):java.util.List");
    }
}
