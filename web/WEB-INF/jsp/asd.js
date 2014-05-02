/**
 * Created by Aarish Khan on 4/28/14.
 */
function addItemToObjectByURL(item ){
    var position={
        X:"",
        Y:"",
        Z:""
    }
    var loader=new THREE.JSONLoader();
    loader.load( { model: item.url, callback:function(geometry,material){
        zmesh = new THREE.Mesh( geometry, new THREE.MeshFaceMaterial(material) );
        console.log(wallNumRefference);
        var  objectSetting=setFrontViewDistance(wallNumRefference);
        console.log(setFrontViewDistance(wallNumRefference))
        if(item.centered){
            position.X=item.predefined.x;
            position.Y=item.predefined.y;
            position.Z=item.predefined.z;

            console.log('center hogya');


        }
        else{
            position.X=item.predefined.x;
            position.Y=item.predefined.y;
            position.Z=item.predefined.z;
            position[objectSetting.view]+=objectSetting.value;
            zmesh.rotation=Math.PI*objectSetting.rotation;
        }

        zmesh.position.set( position.X,position.Y,position.Z );

        zmesh.scale.set(150, 150, 150);
        zmesh.name=item.name;
        console.log(position);
        //zmesh.name="object"+objectNameMaker();
        console.log('load hogya');
        AddedObjects.push(zmesh);
        groupObject.add(zmesh);
        Renderer.render(scene,camera);

    } } );
}
