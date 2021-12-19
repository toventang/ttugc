package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.FetchModelType;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.p2082ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.download.IModelDownloader;
import com.p2082ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelDownloader */
public class ModelDownloader implements IModelDownloader {
    private DownloadedModelStorage mDownloadedModelStorage;
    private EffectNetWorkerWrapper mNetWorker;

    static {
        Covode.recordClassIndex(95399);
    }

    public ModelDownloader(DownloadedModelStorage downloadedModelStorage, EffectNetWorkerWrapper effectNetWorkerWrapper) {
        this.mDownloadedModelStorage = downloadedModelStorage;
        this.mNetWorker = effectNetWorkerWrapper;
    }

    private InputStream generateInputStream(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace) {
        String str = "";
        for (String str2 : modelInfo.getFile_url().getUrl(ModelConverterExtKt.toKNFetchModelType(fetchModelType))) {
            EPMonitor.traceStep(monitorTrace, "ModelDownloader#generateInputStream, downloadUrl = ".concat(String.valueOf(str2)));
            try {
                return this.mNetWorker.execute(new EffectRequest("GET", str2, false));
            } catch (Exception e) {
                str = "download model: with type " + fetchModelType + ", with url " + str2 + " failed " + e.getMessage();
                EPMonitor.traceStep(monitorTrace, "ModelDownloader#generateInputStream, exception occurred, errorMessage= ".concat(String.valueOf(str)));
            }
        }
        throw new RuntimeException(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.download.IModelDownloader
    public synchronized long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace) {
        long writeModelToDisk;
        FetchModelType fetchModelType2 = fetchModelType;
        synchronized (this) {
            MethodCollector.m26663i(1407);
            ExtendedUrlModel fileUrl = modelInfo.getFileUrl();
            if (fileUrl.getUrlList() == null || fileUrl.getUrlList().isEmpty()) {
                fetchModelType2 = FetchModelType.ZIP;
            }
            if (fileUrl.getZipUrlList() == null || fileUrl.getZip_url_list().isEmpty()) {
                fetchModelType2 = FetchModelType.ORIGIN;
            }
            String fullNameFromModelInfo = ModelNameProcessor.getFullNameFromModelInfo(modelInfo);
            InputStream generateInputStream = generateInputStream(modelInfo, fetchModelType2, monitorTrace);
            EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, network request success!");
            ArrayList<String> listLocalModelKeysByName = this.mDownloadedModelStorage.listLocalModelKeysByName(modelInfo.getName());
            try {
                writeModelToDisk = this.mDownloadedModelStorage.writeModelToDisk(fetchModelType2, fullNameFromModelInfo, generateInputStream, MessageDigest.getInstance("MD5"), modelInfo.getFile_url().getUri(), monitorTrace);
                EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, writeModelToDisk fileSize = ".concat(String.valueOf(writeModelToDisk)));
                EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, try clean old model, existingModels.size = " + listLocalModelKeysByName.size());
                int size = listLocalModelKeysByName.size();
                for (int i = 0; i < size; i++) {
                    String str = listLocalModelKeysByName.get(i);
                    try {
                        this.mDownloadedModelStorage.clearModelFromDisk(str);
                        EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, delete old model success, modelName = ".concat(String.valueOf(str)));
                    } catch (Exception e) {
                        EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, delete old model failed, modelName = " + str + ", cause = " + e.getMessage());
                    }
                }
                if (generateInputStream != null) {
                    try {
                        generateInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                MethodCollector.m26664o(1407);
            } catch (NoSuchAlgorithmException e2) {
                EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, NoSuchAlgorithmException occurred, cause = " + e2.getMessage());
                AssertionError assertionError = new AssertionError();
                MethodCollector.m26664o(1407);
                throw assertionError;
            } catch (RuntimeException e3) {
                EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, RuntimeException occurred, cause = " + e3.getMessage());
                RuntimeException runtimeException = new RuntimeException("convertStreamToFile: with type: " + fetchModelType2 + ",with name: " + fullNameFromModelInfo + " failed. " + e3.getMessage(), e3);
                MethodCollector.m26664o(1407);
                throw runtimeException;
            } catch (Throwable th) {
                if (generateInputStream != null) {
                    try {
                        generateInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                MethodCollector.m26664o(1407);
                throw th;
            }
        }
        return writeModelToDisk;
    }
}
