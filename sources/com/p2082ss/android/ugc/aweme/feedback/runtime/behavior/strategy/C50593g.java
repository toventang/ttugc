package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g */
public final class C50593g extends AbstractC50584a {

    /* renamed from: a */
    public static final C50594a f116901a = new C50594a((byte) 0);

    static {
        Covode.recordClassIndex(59749);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abor_draft_local_info";
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g$a */
    public static final class C50594a {
        static {
            Covode.recordClassIndex(59750);
        }

        private C50594a() {
        }

        public /* synthetic */ C50594a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        String a;
        long j;
        IAVDraftService draftService = AVExternalServiceImpl.m113114a().draftService();
        int queryDraftListCount = draftService.queryDraftListCount(true);
        List<Integer> queryUserDraftCounts = draftService.queryUserDraftCounts(false);
        int s = C89070n.m154599s(queryUserDraftCounts) + queryDraftListCount;
        File file = new File(draftService.getReadableDBPath());
        if (!file.exists() || !file.isFile()) {
            a = m94852a(-1);
        } else {
            a = m94852a(file.lastModified());
        }
        String dBCreationTime = draftService.getDBCreationTime();
        if (dBCreationTime == null || dBCreationTime.length() == 0) {
            if (!file.exists() || !file.isFile()) {
                dBCreationTime = "Unknown";
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    j = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
                } else {
                    j = -1;
                }
                dBCreationTime = m94852a(j);
            }
        }
        File dataDirectory = Environment.getDataDirectory();
        C89219l.m154716b(dataDirectory, "");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        int i = Build.VERSION.SDK_INT;
        long blockSizeLong = statFs.getBlockSizeLong();
        int i2 = Build.VERSION.SDK_INT;
        LocalDraftLog localDraftLog = new LocalDraftLog("draft_count", dBCreationTime, a, queryDraftListCount, s, queryUserDraftCounts, m94853b(statFs.getAvailableBlocksLong() * blockSizeLong));
        GsonProvider c = GsonHolder.m138943c();
        C89219l.m154716b(c, "");
        String b = c.mo123620b().mo46674b(localDraftLog);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    private static String m94852a(long j) {
        if (j <= 0) {
            return "Unknown";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }

    /* renamed from: b */
    private static String m94853b(long j) {
        if (j < 0) {
            return "Unknown";
        }
        String str = null;
        if (j >= 1024) {
            j /= 1024;
            if (j >= 1024) {
                j /= 1024;
                str = "MB";
            } else {
                str = "KB";
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j));
        int length = sb.length();
        while (true) {
            length -= 3;
            if (length <= 0) {
                break;
            }
            sb.insert(length, ',');
        }
        if (str != null) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
