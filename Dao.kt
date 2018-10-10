@Dao
interface PendaftaranDao {

    @Query("SELECT * FROM pendaftaran_data WHERE pendaftaranOnlineId = :id")
    fun getPendaftaranById(id: Int?) : Single<PendaftaranDetailData>

    @Query("SELECT * FROM pendaftaran_data")
    fun getAllPendaftaranData() : Single<List<PendaftaranDetailData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPendaftaranDetail(pendaftaranDetailData: PendaftaranDetailData)
}