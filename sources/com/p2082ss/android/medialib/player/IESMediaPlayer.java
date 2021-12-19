package com.p2082ss.android.medialib.player;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.Point;
import com.p2082ss.android.medialib.p2156c.C29993a;
import com.p2082ss.android.medialib.player.AbstractC30022a;
import com.p2082ss.android.ttve.nativePort.C30731d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.player.IESMediaPlayer */
public class IESMediaPlayer {
    private Context context;
    private long mHandle = nativeCreatePlayer();
    private AbstractC30022a.AbstractC30023a mInfoListener;

    private native long nativeCreatePlayer();

    private native long nativeCurrentPosition(long j);

    private native int nativeDeleteSeg(long j, int i);

    private native int nativeFillBackgroundColor(long j, int i);

    private native long nativeGetDuration(long j);

    private native long[] nativeGetDurations(long j);

    private native boolean nativeIsMultiSpeedSupported(long j, int i);

    private native boolean nativeIsPlaying(long j);

    private native boolean nativeIsSeeking(long j);

    private native int nativePause(long j);

    private native int nativePrepare(long j, String[] strArr, int i, int i2);

    private native void nativeRelease(long j);

    private native int nativeResume(long j);

    private native int nativeSeek(long j, long j2, int i);

    private native int nativeSelect(long j, int i);

    private native void nativeSetBoundary(long j, int i, long j2, long j3);

    private native void nativeSetLoop(long j, boolean z);

    private native int nativeSetSegPoints(long j, int i, long[] jArr);

    private native int nativeSetSegRotation(long j, int i, int i2);

    private native void nativeSetSpeed(long j, int i, double d);

    private native void nativeSetVolume(long j, double d);

    private native int nativeStart(long j, Surface surface);

    private native void nativeStop(long j);

    public void onInfo(int i, int i2) {
    }

    static {
        Covode.recordClassIndex(36506);
        C30731d.m63118c();
    }

    public long getCurrentPosition() {
        MethodCollector.m26663i(1459);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1459);
            return 0;
        }
        long nativeCurrentPosition = nativeCurrentPosition(j);
        MethodCollector.m26664o(1459);
        return nativeCurrentPosition;
    }

    public long getDuration() {
        MethodCollector.m26663i(1455);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1455);
            return 0;
        }
        long nativeGetDuration = nativeGetDuration(j);
        MethodCollector.m26664o(1455);
        return nativeGetDuration;
    }

    public boolean isPlaying() {
        MethodCollector.m26663i(1467);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1467);
            return false;
        }
        boolean nativeIsPlaying = nativeIsPlaying(j);
        MethodCollector.m26664o(1467);
        return nativeIsPlaying;
    }

    public boolean isSeeking() {
        MethodCollector.m26663i(1470);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1470);
            return false;
        }
        boolean nativeIsSeeking = nativeIsSeeking(j);
        MethodCollector.m26664o(1470);
        return nativeIsSeeking;
    }

    public int pause() {
        MethodCollector.m26663i(1345);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1345);
            return -1;
        }
        int nativePause = nativePause(j);
        MethodCollector.m26664o(1345);
        return nativePause;
    }

    public void release() {
        MethodCollector.m26663i(1353);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1353);
            return;
        }
        nativeRelease(j);
        this.mHandle = 0;
        MethodCollector.m26664o(1353);
    }

    public int resume() {
        MethodCollector.m26663i(1343);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1343);
            return -1;
        }
        int nativeResume = nativeResume(j);
        MethodCollector.m26664o(1343);
        return nativeResume;
    }

    public void stop() {
        MethodCollector.m26663i(1350);
        long j = this.mHandle;
        if (j != 0) {
            nativeStop(j);
        }
        MethodCollector.m26664o(1350);
    }

    public int unSelect() {
        MethodCollector.m26663i(1366);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1366);
            return -1;
        }
        int nativeSelect = nativeSelect(j, -1);
        MethodCollector.m26664o(1366);
        return nativeSelect;
    }

    public List<Long> getDurations() {
        MethodCollector.m26663i(1458);
        ArrayList arrayList = new ArrayList();
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1458);
            return arrayList;
        }
        long[] nativeGetDurations = nativeGetDurations(j);
        if (nativeGetDurations != null) {
            for (long j2 : nativeGetDurations) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        MethodCollector.m26664o(1458);
        return arrayList;
    }

    public void setMessageListener(AbstractC30022a.AbstractC30023a aVar) {
        this.mInfoListener = aVar;
    }

    public int seek(long j) {
        return seek(j, 0);
    }

    public int seekLeft(long j) {
        return seek(j, -1);
    }

    public int seekRight(long j) {
        return seek(j, 1);
    }

    public void setSpeed(double d) {
        setSegSpeed(-1, d);
    }

    public int prepare(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return prepare(arrayList);
    }

    public IESMediaPlayer(Context context2) {
        MethodCollector.m26663i(1221);
        this.context = context2;
        MethodCollector.m26664o(1221);
    }

    public int fillBackgroundColor(int i) {
        MethodCollector.m26663i(1385);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1385);
            return -1;
        }
        int nativeFillBackgroundColor = nativeFillBackgroundColor(j, i);
        MethodCollector.m26664o(1385);
        return nativeFillBackgroundColor;
    }

    public boolean isSegMultiSpeedSupported(int i) {
        MethodCollector.m26663i(1386);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1386);
            return false;
        }
        boolean nativeIsMultiSpeedSupported = nativeIsMultiSpeedSupported(j, i);
        MethodCollector.m26664o(1386);
        return nativeIsMultiSpeedSupported;
    }

    public void setLoop(boolean z) {
        MethodCollector.m26663i(1357);
        long j = this.mHandle;
        if (j != 0) {
            nativeSetLoop(j, z);
        }
        MethodCollector.m26664o(1357);
    }

    public void setVolume(double d) {
        MethodCollector.m26663i(1474);
        long j = this.mHandle;
        if (j != 0) {
            nativeSetVolume(j, d);
        }
        MethodCollector.m26664o(1474);
    }

    public int start(Surface surface) {
        MethodCollector.m26663i(1234);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1234);
            return -1;
        }
        int nativeStart = nativeStart(j, surface);
        MethodCollector.m26664o(1234);
        return nativeStart;
    }

    public int deleteSeg(int i) {
        MethodCollector.m26663i(1464);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1464);
            return -1;
        } else if (i < 0) {
            MethodCollector.m26664o(1464);
            return -2;
        } else {
            int nativeDeleteSeg = nativeDeleteSeg(j, i);
            MethodCollector.m26664o(1464);
            return nativeDeleteSeg;
        }
    }

    public int select(int i) {
        MethodCollector.m26663i(1363);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(1363);
            return -1;
        } else if (i < 0) {
            MethodCollector.m26664o(1363);
            return -2;
        } else {
            int nativeSelect = nativeSelect(j, i);
            MethodCollector.m26664o(1363);
            return nativeSelect;
        }
    }

    public int prepare(List<String> list) {
        int i;
        int i2;
        MethodCollector.m26663i(1232);
        if (this.mHandle == 0) {
            MethodCollector.m26664o(1232);
            return -1;
        } else if (list == null || list.isEmpty()) {
            MethodCollector.m26664o(1232);
            return -2;
        } else {
            Context context2 = this.context;
            if (context2 != null) {
                Pair<Integer, Integer> a = C29993a.m60538a(context2);
                i = ((Integer) a.first).intValue();
                i2 = ((Integer) a.second).intValue();
            } else {
                i = 0;
                i2 = 0;
            }
            int nativePrepare = nativePrepare(this.mHandle, (String[]) list.toArray(new String[list.size()]), i, i2);
            MethodCollector.m26664o(1232);
            return nativePrepare;
        }
    }

    private int seek(long j, int i) {
        MethodCollector.m26663i(1372);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(1372);
            return -1;
        }
        int nativeSeek = nativeSeek(j2, j, i);
        MethodCollector.m26664o(1372);
        return nativeSeek;
    }

    public void setBoundary(long j, long j2) {
        MethodCollector.m26663i(1376);
        long j3 = this.mHandle;
        if (j3 != 0) {
            nativeSetBoundary(j3, -1, j, j2);
        }
        MethodCollector.m26664o(1376);
    }

    public void setSegRotation(int i, int i2) {
        MethodCollector.m26663i(1384);
        if (i < 0) {
            MethodCollector.m26664o(1384);
            return;
        }
        long j = this.mHandle;
        if (j != 0) {
            nativeSetSegRotation(j, i, i2);
        }
        MethodCollector.m26664o(1384);
    }

    public void setSegSpeed(int i, double d) {
        MethodCollector.m26663i(1382);
        long j = this.mHandle;
        if (j != 0) {
            nativeSetSpeed(j, i, d);
        }
        MethodCollector.m26664o(1382);
    }

    public int setSegPoints(int i, List<Point> list) {
        MethodCollector.m26663i(1451);
        if (this.mHandle == 0) {
            MethodCollector.m26664o(1451);
            return -1;
        } else if (list == null || list.isEmpty()) {
            MethodCollector.m26664o(1451);
            return -2;
        } else {
            long[] jArr = new long[list.size()];
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 += 2) {
                Point point = list.get(i2);
                if (point == null) {
                    jArr[i2] = -1;
                    jArr[i2 + 1] = -1;
                } else {
                    jArr[i2] = point.getLeft();
                    jArr[i2 + 1] = point.getRight();
                }
            }
            int nativeSetSegPoints = nativeSetSegPoints(this.mHandle, i, jArr);
            MethodCollector.m26664o(1451);
            return nativeSetSegPoints;
        }
    }

    public void setSegBoundary(int i, long j, long j2) {
        MethodCollector.m26663i(1380);
        if (i < 0) {
            MethodCollector.m26664o(1380);
            return;
        }
        long j3 = this.mHandle;
        if (j3 != 0) {
            nativeSetBoundary(j3, i, j, j2);
        }
        MethodCollector.m26664o(1380);
    }
}
