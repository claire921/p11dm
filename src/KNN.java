import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class KNN {

	public static void main(String[] args) {
		DataSource source = null;
		Instances data = null;
		try {
			source = new DataSource("trainProdSelection.arff");
			data = source.getDataSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (data.classIndex() == -1) data.setClassIndex(data.numAttributes() - 1);		
		 
		System.out.println("\nDataset:\n");
		System.out.println(data);
		 
		Instance first = data.firstInstance();
		Instance second = data.get(data.numInstances() - 1);
		System.out.println(first.classValue());
		System.out.println(second.classValue());
	}
}
