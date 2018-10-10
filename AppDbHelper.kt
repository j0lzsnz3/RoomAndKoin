open class AppDbHelper(private val pendaftaranDao: PendaftaranDao) : DbHelper {

    override fun insertPendaftaranDetail(pendaftaranDetailData: PendaftaranDetailData): Completable =
            Completable.fromAction{
                pendaftaranDao.insertPendaftaranDetail(pendaftaranDetailData)
            }

    override fun getPendaftaranById(id: Int?): Single<PendaftaranDetailData> =
            pendaftaranDao.getPendaftaranById(id)

    override fun getAllPendaftaranData(): Single<List<PendaftaranDetailData>> =
            pendaftaranDao.getAllPendaftaranData()
}