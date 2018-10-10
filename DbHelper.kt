interface DbHelper {
    fun insertPendaftaranDetail(pendaftaranDetailData: PendaftaranDetailData) : Completable

    fun getPendaftaranById(id: Int?) : Single<PendaftaranDetailData>

    fun getAllPendaftaranData() : Single<List<PendaftaranDetailData>>
}