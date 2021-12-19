package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.o */
public interface AbstractC30423o {
    static {
        Covode.recordClassIndex(36942);
    }

    /* renamed from: a */
    int mo54143a(String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo54144a(String str);

    /* renamed from: a */
    void mo54145a();

    /* renamed from: a */
    void mo54146a(int i);

    /* renamed from: a */
    void mo54147a(int i, int i2);

    /* renamed from: a */
    void mo54148a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo54149a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo54150a(int i, int i2, long j);

    /* renamed from: a */
    void mo54151a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z);

    /* renamed from: a */
    void mo54152a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z, boolean z2);

    /* renamed from: a */
    void mo54153a(int i, long j);

    /* renamed from: a */
    void mo54154a(int i, Notification notification);

    /* renamed from: a */
    void mo54155a(int i, AbstractC30393y yVar);

    /* renamed from: a */
    void mo54156a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo54157a(int i, boolean z);

    /* renamed from: a */
    void mo54158a(int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo54159a(AbstractC30345ag agVar);

    /* renamed from: a */
    void mo54160a(DownloadChunk downloadChunk);

    /* renamed from: a */
    void mo54161a(DownloadTask downloadTask);

    /* renamed from: a */
    void mo54162a(List<String> list);

    /* renamed from: a */
    void mo54163a(boolean z);

    /* renamed from: a */
    boolean mo54164a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo54165b(String str, String str2);

    /* renamed from: b */
    List<DownloadInfo> mo54166b(String str);

    /* renamed from: b */
    void mo54167b(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z);

    /* renamed from: b */
    void mo54168b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo54169b(int i, boolean z);

    /* renamed from: b */
    void mo54170b(DownloadInfo downloadInfo);

    /* renamed from: b */
    void mo54171b(DownloadTask downloadTask);

    /* renamed from: b */
    void mo54172b(List<String> list);

    /* renamed from: b */
    boolean mo54173b();

    /* renamed from: b */
    boolean mo54174b(int i);

    /* renamed from: c */
    List<DownloadInfo> mo54175c(String str);

    /* renamed from: c */
    void mo54176c(int i);

    /* renamed from: c */
    boolean mo54177c();

    /* renamed from: c */
    boolean mo54178c(DownloadInfo downloadInfo);

    /* renamed from: d */
    List<DownloadInfo> mo54179d();

    /* renamed from: d */
    List<DownloadInfo> mo54180d(String str);

    /* renamed from: d */
    void mo54181d(int i);

    /* renamed from: e */
    long mo54182e(int i);

    /* renamed from: e */
    List<DownloadInfo> mo54183e(String str);

    /* renamed from: e */
    void mo54184e();

    /* renamed from: f */
    int mo54185f(int i);

    /* renamed from: f */
    boolean mo54186f();

    /* renamed from: g */
    void mo54187g();

    /* renamed from: g */
    boolean mo54188g(int i);

    /* renamed from: h */
    DownloadInfo mo54189h(int i);

    /* renamed from: h */
    boolean mo54190h();

    /* renamed from: i */
    List<DownloadChunk> mo54191i(int i);

    /* renamed from: j */
    void mo54192j(int i);

    /* renamed from: k */
    void mo54193k(int i);

    /* renamed from: l */
    boolean mo54194l(int i);

    /* renamed from: m */
    int mo54195m(int i);

    /* renamed from: n */
    boolean mo54196n(int i);

    /* renamed from: o */
    void mo54197o(int i);

    /* renamed from: p */
    boolean mo54198p(int i);

    /* renamed from: q */
    AbstractC30393y mo54199q(int i);

    /* renamed from: r */
    AbstractC30337ac mo54200r(int i);

    /* renamed from: s */
    AbstractC30379q mo54201s(int i);
}
