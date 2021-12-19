package com.p2082ss.android.ugc.aweme.feed.p2941c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.feed.api.BackUpApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49665a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.feed.c.a */
public final class C49292a {

    /* renamed from: a */
    public static final C49292a f113304a = new C49292a();

    private C49292a() {
    }

    static {
        Covode.recordClassIndex(58090);
    }

    /* renamed from: a */
    public static final void m92331a(String str, int i) {
        C89219l.m154721d(str, "");
        try {
            AwemeStatisticsResponse awemeStatisticsResponse = BackUpApi.f111977a.queryAwemeStatistics(str, i).get();
            List<AwemeStatisticsBackup> statisticsList = awemeStatisticsResponse.getStatisticsList();
            if (statisticsList != null) {
                Iterator it = C89070n.m154518a((Collection<?>) statisticsList).iterator();
                while (it.hasNext()) {
                    AwemeStatisticsBackup awemeStatisticsBackup = statisticsList.get(((AbstractC89040af) it).mo143429a());
                    if (awemeStatisticsBackup != null) {
                        String aid = awemeStatisticsBackup.getAid();
                        Aweme b = AwemeService.m70060b().mo60684b(aid);
                        if (b == null) {
                            C51423a.m95784a(4, "FeedBackupHelper", "FeedBackupHelper find that aweme is null!".concat(String.valueOf(aid)));
                        } else {
                            C51423a.m95784a(4, "FeedBackupHelper", "FeedBackupHelper start to update this aweme:".concat(String.valueOf(awemeStatisticsBackup)));
                            if (i == 2) {
                                if (b.getStatistics() == null) {
                                    b.setStatistics(new AwemeStatistics());
                                }
                                Long commentCount = awemeStatisticsBackup.getCommentCount();
                                if (commentCount == null) {
                                    C89219l.m154715b();
                                }
                                if (commentCount.longValue() > 0) {
                                    AwemeStatistics statistics = b.getStatistics();
                                    C89219l.m154716b(statistics, "");
                                    statistics.setAid(aid);
                                    AwemeStatistics statistics2 = b.getStatistics();
                                    C89219l.m154716b(statistics2, "");
                                    Long commentCount2 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount2 == null) {
                                        C89219l.m154715b();
                                    }
                                    statistics2.setCommentCount(commentCount2.longValue());
                                }
                            } else if (i == 3 || i == 1) {
                                if (b.getStatistics() == null) {
                                    b.setStatistics(new AwemeStatistics());
                                }
                                AwemeStatistics statistics3 = b.getStatistics();
                                if (statistics3 != null) {
                                    statistics3.setAid(awemeStatisticsBackup.getAid());
                                    Long commentCount3 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount3 == null) {
                                        C89219l.m154715b();
                                    }
                                    if (commentCount3.longValue() > 0) {
                                        Long commentCount4 = awemeStatisticsBackup.getCommentCount();
                                        if (commentCount4 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setCommentCount(commentCount4.longValue());
                                    }
                                    Long diggCount = awemeStatisticsBackup.getDiggCount();
                                    if (diggCount == null) {
                                        C89219l.m154715b();
                                    }
                                    if (diggCount.longValue() > 0) {
                                        Long diggCount2 = awemeStatisticsBackup.getDiggCount();
                                        if (diggCount2 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setDiggCount(diggCount2.longValue());
                                    }
                                    Long playCount = awemeStatisticsBackup.getPlayCount();
                                    if (playCount == null) {
                                        C89219l.m154715b();
                                    }
                                    if (playCount.longValue() > 0) {
                                        Long playCount2 = awemeStatisticsBackup.getPlayCount();
                                        if (playCount2 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setPlayCount(playCount2.longValue());
                                    }
                                    Long downloadCount = awemeStatisticsBackup.getDownloadCount();
                                    if (downloadCount == null) {
                                        C89219l.m154715b();
                                    }
                                    if (downloadCount.longValue() > 0) {
                                        Long downloadCount2 = awemeStatisticsBackup.getDownloadCount();
                                        if (downloadCount2 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setDownloadCount(downloadCount2.longValue());
                                    }
                                    Long shareCount = awemeStatisticsBackup.getShareCount();
                                    if (shareCount == null) {
                                        C89219l.m154715b();
                                    }
                                    if (shareCount.longValue() > 0) {
                                        Long shareCount2 = awemeStatisticsBackup.getShareCount();
                                        if (shareCount2 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setShareCount(shareCount2.longValue());
                                    }
                                    Long forwardCount = awemeStatisticsBackup.getForwardCount();
                                    if (forwardCount == null) {
                                        C89219l.m154715b();
                                    }
                                    if (forwardCount.longValue() > 0) {
                                        Long forwardCount2 = awemeStatisticsBackup.getForwardCount();
                                        if (forwardCount2 == null) {
                                            C89219l.m154715b();
                                        }
                                        statistics3.setForwardCount(forwardCount2.longValue());
                                    }
                                }
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) statisticsList, 10)), 16));
                for (T t : statisticsList) {
                    linkedHashMap.put(t.getAid(), t);
                }
                AbstractC81915c.m141874a(new C49665a(linkedHashMap, i));
                return;
            }
            C51423a.m95784a(4, "FeedBackupHelper", "FeedBackupHelper get rsp,but list is null. rsp content :".concat(String.valueOf(awemeStatisticsResponse)));
        } catch (ExecutionException e) {
            C51423a.m95786a((Exception) AbstractC34479a.getCompatibleException(e));
        }
    }
}
