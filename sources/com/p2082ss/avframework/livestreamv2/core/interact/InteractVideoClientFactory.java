package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory */
public class InteractVideoClientFactory implements LiveCore.ILiveCoreTextureFrameAvailableListener, VideoClientFactory {
    private String TAG = "InteractVideoClientFactory";
    private InteractEngine mEngine;
    private ByteBuffer mSeiBuffer;
    private List<String> mSeiList = new ArrayList();
    private ArrayList<LiveCore.ILiveCoreTextureFrameAvailableListener> mVideoClients = new ArrayList<>();

    static {
        Covode.recordClassIndex(100374);
    }

    private int peekSeiSize() {
        int size;
        MethodCollector.m26663i(2076);
        synchronized (this.mSeiList) {
            try {
                size = this.mSeiList.size();
            } finally {
                MethodCollector.m26664o(2076);
            }
        }
        return size;
    }

    private String popSei() {
        String str;
        MethodCollector.m26663i(2100);
        synchronized (this.mSeiList) {
            try {
                if (!this.mSeiList.isEmpty()) {
                    str = this.mSeiList.remove(0);
                } else {
                    str = null;
                }
            } finally {
                MethodCollector.m26664o(2100);
            }
        }
        return str;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public VideoClient create() {
        InteractVideoClient interactVideoClient;
        MethodCollector.m26663i(1916);
        AVLog.m147805d(this.TAG, "Create video client ");
        synchronized (this.mVideoClients) {
            try {
                if (this.mVideoClients.isEmpty()) {
                    this.mEngine.addTextureFrameAvailableListener(this);
                }
                interactVideoClient = new InteractVideoClient(this.mEngine.getBuilder().isEnableRtcPushStatics());
                interactVideoClient.setDumpFrameParams(this.mEngine.getBuilder().getDumpFrameParams());
                this.mVideoClients.add(interactVideoClient);
            } finally {
                MethodCollector.m26664o(1916);
            }
        }
        return interactVideoClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer getExtraSei() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory.getExtraSei():java.nio.ByteBuffer");
    }

    public InteractVideoClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
    }

    private void pushSei(String str) {
        MethodCollector.m26663i(2069);
        synchronized (this.mSeiList) {
            try {
                this.mSeiList.add(str);
                if (this.mSeiList.size() > 30) {
                    AVLog.m147806e(this.TAG, "SEI buffer overflow with drop old sei...");
                    this.mSeiList.remove(0);
                }
            } finally {
                MethodCollector.m26664o(2069);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public void destroy(VideoClient videoClient) {
        MethodCollector.m26663i(1936);
        AVLog.m147805d(this.TAG, "Destroy video client ");
        synchronized (this.mVideoClients) {
            try {
                this.mVideoClients.remove((InteractVideoClient) videoClient);
                if (this.mVideoClients.isEmpty()) {
                    this.mEngine.addTextureFrameAvailableListener(this);
                    this.mEngine.removeTextureFrameAvailableListener(this);
                }
            } finally {
                MethodCollector.m26664o(1936);
            }
        }
    }

    public void needSaveSei(String str, Object obj) {
        int size;
        MethodCollector.m26663i(1962);
        synchronized (this.mVideoClients) {
            try {
                size = this.mVideoClients.size();
            } catch (Throwable th) {
                MethodCollector.m26664o(1962);
                throw th;
            }
        }
        if (size > 0) {
            if (str != null && str.equals("contour_info") && (obj instanceof String)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject((String) obj);
                    jSONObject2.put("interact_id", this.mEngine.getInteractId());
                    jSONObject.put(str, jSONObject2);
                    pushSei(jSONObject.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(str, obj);
                    pushSei(jSONObject3.toString());
                    MethodCollector.m26664o(1962);
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    AVLog.ioe(this.TAG, "Saving sei failed. ", e2);
                    MethodCollector.m26664o(1962);
                    return;
                }
            }
        }
        AVLog.logToIODevice2(6, this.TAG, "Ignore sei size " + size + " is json " + (obj instanceof JSONObject), null, "sei-json", 1000);
        MethodCollector.m26664o(1962);
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, objArr);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener
    public void onTextureFrameAvailable(android.opengl.EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        Object[] objArr2 = objArr;
        MethodCollector.m26663i(2105);
        if (objArr2.length <= 0) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && peekSeiSize() > 0) {
            objArr2[0] = getExtraSei();
        }
        synchronized (this.mVideoClients) {
            try {
                Iterator<LiveCore.ILiveCoreTextureFrameAvailableListener> it = this.mVideoClients.iterator();
                while (it.hasNext()) {
                    it.next().onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, objArr2);
                }
            } finally {
                MethodCollector.m26664o(2105);
            }
        }
    }
}
