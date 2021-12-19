package com.p2082ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.segment.C30607i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.impls.k */
public final class C30498k implements AbstractC30420l {

    /* renamed from: a */
    public final SparseArray<DownloadInfo> f72709a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<List<DownloadChunk>> f72710b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<Map<Long, C30607i>> f72711c = new SparseArray<>();

    static {
        Covode.recordClassIndex(37026);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53769a(int i, int i2, int i3, int i4) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53781b(int i, List<DownloadChunk> list) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53782b(DownloadChunk downloadChunk) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final boolean mo53791d() {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final boolean mo53793e() {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized void mo53774a(DownloadChunk downloadChunk) {
        MethodCollector.m26663i(10530);
        int i = downloadChunk.f72912a;
        List<DownloadChunk> list = this.f72710b.get(i);
        if (list == null) {
            list = new ArrayList<>();
            this.f72710b.put(i, list);
        }
        list.add(downloadChunk);
        MethodCollector.m26664o(10530);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized boolean mo53776a(DownloadInfo downloadInfo) {
        MethodCollector.m26663i(10980);
        boolean z = true;
        if (downloadInfo == null) {
            MethodCollector.m26664o(10980);
            return true;
        }
        if (this.f72709a.get(downloadInfo.getId()) == null) {
            z = false;
        }
        this.f72709a.put(downloadInfo.getId(), downloadInfo);
        MethodCollector.m26664o(10980);
        return z;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized boolean mo53807a(int i, Map<Long, C30607i> map) {
        MethodCollector.m26663i(11591);
        this.f72711c.put(i, map);
        MethodCollector.m26664o(11591);
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final synchronized List<DownloadInfo> mo53779b() {
        MethodCollector.m26663i(10237);
        if (this.f72709a.size() == 0) {
            MethodCollector.m26664o(10237);
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f72709a.size());
        for (int i = 0; i < this.f72709a.size(); i++) {
            DownloadInfo valueAt = this.f72709a.valueAt(i);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        MethodCollector.m26664o(10237);
        return arrayList;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final synchronized void mo53787c() {
        MethodCollector.m26663i(11422);
        this.f72709a.clear();
        this.f72710b.clear();
        MethodCollector.m26664o(11422);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53783b(DownloadInfo downloadInfo) {
        mo53776a(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: f */
    public final boolean mo53795f(int i) {
        mo53794e(i);
        mo53790d(i);
        mo53812l(i);
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: g */
    public final DownloadInfo mo53796g(int i) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setStatus(2);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: h */
    public final DownloadInfo mo53797h(int i) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setStatus(5);
            b.setFirstDownload(false);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: i */
    public final DownloadInfo mo53798i(int i) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setStatus(1);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: j */
    public final DownloadInfo mo53799j(int i) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setStatus(-7);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final synchronized DownloadInfo mo53777b(int i) {
        DownloadInfo downloadInfo;
        MethodCollector.m26663i(9476);
        try {
            downloadInfo = this.f72709a.get(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(9476);
        return downloadInfo;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final synchronized void mo53790d(int i) {
        MethodCollector.m26663i(10388);
        this.f72710b.remove(i);
        MethodCollector.m26664o(10388);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final synchronized boolean mo53794e(int i) {
        MethodCollector.m26663i(11116);
        this.f72709a.remove(i);
        MethodCollector.m26664o(11116);
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: k */
    public final synchronized Map<Long, C30607i> mo53811k(int i) {
        Map<Long, C30607i> map;
        MethodCollector.m26663i(11590);
        map = this.f72711c.get(i);
        MethodCollector.m26664o(11590);
        return map;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: l */
    public final synchronized void mo53812l(int i) {
        MethodCollector.m26663i(11592);
        this.f72711c.remove(i);
        MethodCollector.m26664o(11592);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final synchronized List<DownloadChunk> mo53785c(int i) {
        List<DownloadChunk> list;
        MethodCollector.m26663i(10386);
        list = this.f72710b.get(i);
        MethodCollector.m26664o(10386);
        return list;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: m */
    public final synchronized List<C30607i> mo53813m(int i) {
        MethodCollector.m26663i(11589);
        Map<Long, C30607i> map = this.f72711c.get(i);
        if (map != null) {
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.values());
                MethodCollector.m26664o(11589);
                return arrayList;
            }
        }
        MethodCollector.m26664o(11589);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final synchronized List<DownloadInfo> mo53786c(String str) {
        MethodCollector.m26663i(9911);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9911);
            return null;
        } else if (this.f72709a.size() == 0) {
            MethodCollector.m26664o(9911);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f72709a.size(); i++) {
                DownloadInfo downloadInfo = this.f72709a.get(this.f72709a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            MethodCollector.m26664o(9911);
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final synchronized List<DownloadInfo> mo53789d(String str) {
        boolean z;
        MethodCollector.m26663i(10073);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(10073);
            return null;
        } else if (this.f72709a.size() == 0) {
            MethodCollector.m26664o(10073);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f72709a.size(); i++) {
                DownloadInfo downloadInfo = this.f72709a.get(this.f72709a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str)) {
                    int status = downloadInfo.getStatus();
                    if (status == -1 || status == -2 || status == -7 || status == -4 || status == -5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(downloadInfo);
                    }
                }
            }
            MethodCollector.m26664o(10073);
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized List<DownloadInfo> mo53767a(String str) {
        ArrayList arrayList;
        MethodCollector.m26663i(9632);
        arrayList = new ArrayList();
        try {
            int size = this.f72709a.size();
            for (int i = 0; i < size; i++) {
                DownloadInfo valueAt = this.f72709a.valueAt(i);
                if (str != null && str.equals(valueAt.getUrl())) {
                    arrayList.add(valueAt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(9632);
        return arrayList;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final synchronized List<DownloadInfo> mo53780b(String str) {
        MethodCollector.m26663i(9772);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9772);
            return null;
        } else if (this.f72709a.size() == 0) {
            MethodCollector.m26664o(9772);
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f72709a.size(); i++) {
                DownloadInfo downloadInfo = this.f72709a.get(this.f72709a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C30292f.m61289e(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            MethodCollector.m26664o(9772);
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final DownloadInfo mo53788d(int i, long j) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-2);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized DownloadInfo mo53764a(int i, int i2) {
        DownloadInfo b;
        MethodCollector.m26663i(10835);
        b = mo53777b(i);
        if (b != null) {
            b.setChunkCount(i2);
        }
        MethodCollector.m26664o(10835);
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final DownloadInfo mo53784c(int i, long j) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-3);
            b.setFirstDownload(false);
            b.setFirstSuccess(false);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53765a(int i, long j) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            if (!(b.getStatus() == -3 || b.getStatus() == -2 || C30292f.m61289e(b.getStatus()) || b.getStatus() == -4)) {
                b.setStatus(4);
            }
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final DownloadInfo mo53778b(int i, long j) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-1);
            b.setFirstDownload(false);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized void mo53772a(int i, List<DownloadChunk> list) {
        MethodCollector.m26663i(11426);
        if (list == null) {
            MethodCollector.m26664o(11426);
            return;
        }
        mo53790d(i);
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                mo53774a(downloadChunk);
                if (downloadChunk.mo54405d()) {
                    for (DownloadChunk downloadChunk2 : downloadChunk.f72918g) {
                        mo53774a(downloadChunk2);
                    }
                }
            }
        }
        MethodCollector.m26664o(11426);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized void mo53771a(int i, int i2, long j) {
        MethodCollector.m26663i(10695);
        List<DownloadChunk> c = mo53785c(i);
        if (c == null) {
            MethodCollector.m26664o(10695);
            return;
        }
        for (DownloadChunk downloadChunk : c) {
            if (downloadChunk != null && downloadChunk.f72916e == i2) {
                downloadChunk.mo54398a(j);
                MethodCollector.m26664o(10695);
                return;
            }
        }
        MethodCollector.m26664o(10695);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53766a(int i, long j, String str, String str2) {
        DownloadInfo b = mo53777b(i);
        if (b != null) {
            b.setTotalBytes(j);
            b.seteTag(str);
            if (TextUtils.isEmpty(b.getName()) && !TextUtils.isEmpty(str2)) {
                b.setName(str2);
            }
            b.setStatus(3);
        }
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final synchronized void mo53770a(int i, int i2, int i3, long j) {
        MethodCollector.m26663i(10696);
        List<DownloadChunk> c = mo53785c(i);
        if (c == null) {
            MethodCollector.m26664o(10696);
            return;
        }
        Iterator<DownloadChunk> it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DownloadChunk next = it.next();
            if (next != null && next.f72916e == i3 && !next.mo54405d()) {
                if (next.f72918g != null) {
                    for (DownloadChunk downloadChunk : next.f72918g) {
                        if (downloadChunk != null && downloadChunk.f72916e == i2) {
                            downloadChunk.mo54398a(j);
                            MethodCollector.m26664o(10696);
                            return;
                        }
                    }
                    MethodCollector.m26664o(10696);
                    return;
                }
            }
        }
        MethodCollector.m26664o(10696);
    }
}
