package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.UploadEventManager */
public enum UploadEventManager {
    instance;
    
    private JSONArray mImageJsonArray = new JSONArray();
    private JSONArray mVideoJsonArray = new JSONArray();

    static {
        Covode.recordClassIndex(101499);
    }

    public final JSONArray popAllEvents() {
        MethodCollector.m26663i(13284);
        JSONArray jSONArray = this.mVideoJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mVideoJsonArray = new JSONArray();
            } finally {
                MethodCollector.m26664o(13284);
            }
        }
        return jSONArray;
    }

    public final JSONArray popAllImageEvents() {
        MethodCollector.m26663i(13286);
        JSONArray jSONArray = this.mImageJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mImageJsonArray = new JSONArray();
            } finally {
                MethodCollector.m26664o(13286);
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    public final void addEvent(JSONObject jSONObject) {
        MethodCollector.m26663i(13285);
        synchronized (UploadEventManager.class) {
            try {
                this.mVideoJsonArray.put(jSONObject);
            } finally {
                MethodCollector.m26664o(13285);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void addImageEvent(JSONObject jSONObject) {
        MethodCollector.m26663i(13287);
        synchronized (UploadEventManager.class) {
            try {
                this.mImageJsonArray.put(jSONObject);
            } finally {
                MethodCollector.m26664o(13287);
            }
        }
    }

    private UploadEventManager() {
    }
}
