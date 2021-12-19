package com.p2082ss.android.ugc.aweme.p3452ml.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60045g;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60015b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.data.f */
public final class C60041f extends AbstractC60028a {

    /* renamed from: h */
    public static boolean f136762h = C59975a.f136570a;

    /* renamed from: i */
    public static final C60042a f136763i = new C60042a((byte) 0);

    /* renamed from: c */
    public ConcurrentHashMap<String, C60015b> f136764c;

    /* renamed from: d */
    public ArrayList<String> f136765d;

    /* renamed from: e */
    public ReentrantReadWriteLock f136766e;

    /* renamed from: f */
    public boolean f136767f;

    /* renamed from: g */
    public boolean f136768g;

    /* renamed from: com.ss.android.ugc.aweme.ml.data.f$a */
    public static final class C60042a {
        static {
            Covode.recordClassIndex(70507);
        }

        private C60042a() {
        }

        public /* synthetic */ C60042a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.data.f$b */
    public static final class C60043b {

        /* renamed from: a */
        static C60041f f136769a = new C60041f((byte) 0);

        /* renamed from: b */
        public static final C60043b f136770b = new C60043b();

        private C60043b() {
        }

        static {
            Covode.recordClassIndex(70508);
        }
    }

    static {
        Covode.recordClassIndex(70506);
    }

    private C60041f() {
        this.f136764c = new ConcurrentHashMap<>();
        this.f136765d = new ArrayList<>();
        this.f136766e = new ReentrantReadWriteLock();
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.data.f$c */
    static final class RunnableC60044c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C60041f f136771a;

        /* renamed from: b */
        final /* synthetic */ String f136772b;

        /* renamed from: c */
        final /* synthetic */ Aweme f136773c;

        static {
            Covode.recordClassIndex(70509);
        }

        RunnableC60044c(C60041f fVar, String str, Aweme aweme) {
            this.f136771a = fVar;
            this.f136772b = str;
            this.f136773c = aweme;
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            User author;
            if (C60041f.f136762h) {
                System.currentTimeMillis();
            }
            this.f136771a.f136766e.writeLock().lock();
            try {
                int i = 1;
                if (!this.f136771a.f136765d.contains(this.f136772b)) {
                    this.f136771a.f136765d.add(this.f136772b);
                    C60045g.C60047b.f136797a.f136776c++;
                }
                if (this.f136771a.f136765d.size() > 48) {
                    String str = this.f136771a.f136765d.get(0);
                    C89219l.m154716b(str, "");
                    this.f136771a.f136764c.remove(str);
                    this.f136771a.f136765d.remove(0);
                }
                this.f136771a.f136766e.writeLock().unlock();
                if (this.f136773c != null && (this.f136771a.f136767f || this.f136771a.f136768g)) {
                    C60015b a = this.f136771a.mo97489a(this.f136772b);
                    if (this.f136771a.f136768g && a != null) {
                        a.f136695u = System.currentTimeMillis();
                    }
                    if (this.f136771a.f136767f && a != null) {
                        a.f136688n = this.f136773c.isAd() ? 1 : 0;
                        a.f136689o = this.f136773c.isMixAweme() ? 1 : 0;
                        User author2 = this.f136773c.getAuthor();
                        if (author2 == null || author2.getFollowStatus() != 1) {
                            i = 0;
                        }
                        a.f136690p = i;
                        if (this.f136773c.getVideo() != null) {
                            Video video = this.f136773c.getVideo();
                            C89219l.m154716b(video, "");
                            a.f136691q = video.getDuration();
                        }
                        if (this.f136773c.getStatistics() != null) {
                            AwemeStatistics statistics = this.f136773c.getStatistics();
                            C89219l.m154716b(statistics, "");
                            a.f136693s = (int) statistics.getDiggCount();
                            AwemeStatistics statistics2 = this.f136773c.getStatistics();
                            C89219l.m154716b(statistics2, "");
                            a.f136692r = (int) statistics2.getCommentCount();
                            AwemeStatistics statistics3 = this.f136773c.getStatistics();
                            C89219l.m154716b(statistics3, "");
                            a.f136694t = (int) statistics3.getShareCount();
                        }
                    }
                }
                if (C60041f.f136762h) {
                    System.currentTimeMillis();
                    Aweme aweme = this.f136773c;
                    if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                        author.getNickname();
                    }
                    this.f136771a.f136765d.size();
                }
            } catch (Throwable th) {
                this.f136771a.f136766e.writeLock().unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ C60041f(byte b) {
        this();
    }

    /* renamed from: a */
    public final C60015b mo97489a(String str) {
        if (str != null && str.length() > 0 && !this.f136764c.containsKey(str)) {
            this.f136764c.putIfAbsent(str, new C60015b(str));
        }
        return this.f136764c.get(str);
    }

    /* renamed from: a */
    public final List<C60015b> mo97490a(String str, int i, boolean z) {
        String str2;
        this.f136766e.readLock().lock();
        try {
            int size = this.f136765d.size();
            int i2 = size - 1;
            if (!TextUtils.isEmpty(str) && C89070n.m154556a((Iterable) this.f136765d, (Object) str)) {
                i2 = C89070n.m154546a((List) this.f136765d, (Object) str);
                if (z) {
                    i2--;
                }
            }
            if (i2 < 0 || i2 >= size) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                C60015b bVar = (i2 < 0 || (str2 = this.f136765d.get(i2)) == null) ? null : this.f136764c.get(str2);
                i2--;
                arrayList.add(bVar);
            }
            this.f136766e.readLock().unlock();
            return arrayList;
        } finally {
            this.f136766e.readLock().unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02f8 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0328 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x034a A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0351 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0353 A[Catch:{ all -> 0x0441 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97491a(java.util.Map<java.lang.String, java.lang.Object> r53, com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig r54, com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h r55) {
        /*
        // Method dump skipped, instructions count: 1093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3452ml.data.C60041f.mo97491a(java.util.Map, com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig, com.ss.android.ugc.aweme.ml.infra.h):boolean");
    }
}
