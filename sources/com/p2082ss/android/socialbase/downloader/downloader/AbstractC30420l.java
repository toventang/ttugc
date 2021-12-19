package com.p2082ss.android.socialbase.downloader.downloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.segment.C30607i;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.downloader.l */
public interface AbstractC30420l {
    static {
        Covode.recordClassIndex(36939);
    }

    /* renamed from: a */
    DownloadInfo mo53764a(int i, int i2);

    /* renamed from: a */
    DownloadInfo mo53765a(int i, long j);

    /* renamed from: a */
    DownloadInfo mo53766a(int i, long j, String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo53767a(String str);

    /* renamed from: a */
    void mo53769a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo53770a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo53771a(int i, int i2, long j);

    /* renamed from: a */
    void mo53772a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo53774a(DownloadChunk downloadChunk);

    /* renamed from: a */
    boolean mo53807a(int i, Map<Long, C30607i> map);

    /* renamed from: a */
    boolean mo53776a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo53777b(int i);

    /* renamed from: b */
    DownloadInfo mo53778b(int i, long j);

    /* renamed from: b */
    List<DownloadInfo> mo53779b();

    /* renamed from: b */
    List<DownloadInfo> mo53780b(String str);

    /* renamed from: b */
    void mo53781b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo53782b(DownloadChunk downloadChunk);

    /* renamed from: b */
    void mo53783b(DownloadInfo downloadInfo);

    /* renamed from: c */
    DownloadInfo mo53784c(int i, long j);

    /* renamed from: c */
    List<DownloadChunk> mo53785c(int i);

    /* renamed from: c */
    List<DownloadInfo> mo53786c(String str);

    /* renamed from: c */
    void mo53787c();

    /* renamed from: d */
    DownloadInfo mo53788d(int i, long j);

    /* renamed from: d */
    List<DownloadInfo> mo53789d(String str);

    /* renamed from: d */
    void mo53790d(int i);

    /* renamed from: d */
    boolean mo53791d();

    /* renamed from: e */
    boolean mo53793e();

    /* renamed from: e */
    boolean mo53794e(int i);

    /* renamed from: f */
    boolean mo53795f(int i);

    /* renamed from: g */
    DownloadInfo mo53796g(int i);

    /* renamed from: h */
    DownloadInfo mo53797h(int i);

    /* renamed from: i */
    DownloadInfo mo53798i(int i);

    /* renamed from: j */
    DownloadInfo mo53799j(int i);

    /* renamed from: k */
    Map<Long, C30607i> mo53811k(int i);

    /* renamed from: l */
    void mo53812l(int i);

    /* renamed from: m */
    List<C30607i> mo53813m(int i);
}
